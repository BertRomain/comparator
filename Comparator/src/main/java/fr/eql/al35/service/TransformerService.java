package fr.eql.al35.service;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import fr.eql.al35.iservice.TransformerIService;

public class TransformerService implements TransformerIService {

	@Override
	public void fetchFeed() {
		
		try (BufferedInputStream inputStream = new BufferedInputStream(new URL("http://priceminister.effiliation.com/output/commun/effiliation_COMPUTER_storage_NEW.csv").openStream());
				FileOutputStream fileOS = new FileOutputStream("./flux/rakuten.csv")) {
			byte data[] = new byte[1024];
			int byteContent;
			while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
				fileOS.write(data, 0, byteContent);
			}
		} catch (IOException e) {
			// handles IO exceptions
		}
		System.out.println("import du flux");
		}


}
