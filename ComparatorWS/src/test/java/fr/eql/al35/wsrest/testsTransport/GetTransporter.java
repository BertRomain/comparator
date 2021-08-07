package fr.eql.al35.wsrest.testsTransport;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import fr.eql.al35.comparator.MerchantApplication;
import fr.eql.al35.comparator.entity.Offer;
import fr.eql.al35.comparator.service.OfferService;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {MerchantApplication.class})
class GetTransporter {

	@Autowired
	private OfferService offerService; 


	@Test
	@DisplayName("Test de non nullité")	
	void TU_EAN_3760033021812() {
		List<Offer> list = offerService.listOffers("3760033021812"); 
		assertNotEquals(null, list);
	}
		
	
}

