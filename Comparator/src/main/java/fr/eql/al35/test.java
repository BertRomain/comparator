package fr.eql.al35;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.eql.al35.service.CsvParserService;

@SpringBootApplication
@EnableAutoConfiguration
public class test implements CommandLineRunner {

	@Autowired
	CsvParserService CPS;
	
	public static void main(String[] args) {
		SpringApplication.run(test.class, args);
		System.out.println("Programme lancé");
	}

	@Override
	public void run(String... args) throws Exception {
		 
		
		FileUtils.copyURLToFile(
				new URL("http://priceminister.effiliation.com/output/commun/effiliation_COMPUTER_storage_NEW.csv"), //récupération du flux
				new File("./src/main/resources/flux/rakuten.csv")); //stockage en local car taille > 50Mo
		System.out.println("Fichier importé");
		System.out.println("début de l'import");
		long startTime = System.nanoTime(); //flag de début pour calcul du temps d'éxécution.
		CPS.csvToOffer(convertCSVtoInputStream());
		System.out.println("fin de l'import");//flag de fin pour calcul du temps d'éxécution.
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Durée de l'import :" + (duration/1000000000)/60 + " minutes");
	}
	
	public static InputStream convertCSVtoInputStream() throws IOException {
		File initialFile = new File("./src/main/resources/flux/rakuten.csv");
		InputStream targetStream = new FileInputStream(initialFile); //conversion du fichier en InputStream
		return targetStream;
	}

}
