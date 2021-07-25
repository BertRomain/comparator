package fr.eql.al35.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eql.al35.entity.Merchant;
import fr.eql.al35.entity.Offer;
import fr.eql.al35.repository.OfferRepository;

@Service
public class CsvParserService {

	@Autowired
	private OfferRepository offerRepository;

	@Autowired
	private OfferService offerService;

	static Merchant merchant = new Merchant(); 
	static Offer offer = new Offer();
	static int created = 0; 
	static int rejected = 0; 
	static int updated = 0; 
	
	public String TYPE = "text/csv";
	public void csvToOffer(InputStream is) {

		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withDelimiter('|')
						.withHeader("codebarre", "nomproduit", "theme",	"prix",	"urlficheproduit") //déclaration des headers à récuéprer
						.withFirstRecordAsHeader() //saut de la première ligne 
						.withIgnoreHeaderCase()
						.withTrim()
						.withIgnoreEmptyLines()
						.withQuote(null));) //pour les quotes insérées par erreur dans les ligne 
		{
			
			Iterable<CSVRecord> csvRecords = csvParser.getRecords();
			for (CSVRecord csvRecord : csvRecords) {

				if (csvRecord.get("codebarre").equalsIgnoreCase("")) { //on ignore les lignes sans EAN
					rejected ++;
					continue;

					//TODO Magic number
				} else if (csvRecord.size() < 12) {  //on ignore les lignes mal formatées
					rejected ++;
					continue;

				} else if (csvRecord.get("prix").matches(".*[a-z].*")) { //on ignore les lignes dont les contenus génèrent des erreurs de type (double/string)
					rejected ++;
					continue;
				}
				
				merchant.setId(6);
				Offer offer = new Offer(
						csvRecord.get("codebarre"),
						csvRecord.get("nomproduit"),
						csvRecord.get("theme"),
						csvRecord.get("urlficheproduit"),
						Double.parseDouble(csvRecord.get("prix")),
						merchant);
				if (offerService.existByEan(offer) != null) {
					offerService.mergeOffer(offer);
					updated++;
				} else 
					offer.setCreateDate(java.time.LocalDate.now());
					offerRepository.save(offer);
					created++;
				System.out.println("Traitement de la ligne " + csvRecord.getRecordNumber());
			}
			System.out.println("Nombre de lignes insérées dans la base de données : " + created);
			System.out.println("Nombre de lignes mise à jour dans la base de données : " + updated);
			System.out.println("Nombre de lignes rejetées : " + rejected);
		} catch (IOException e) {
			throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
		}
	}

}

