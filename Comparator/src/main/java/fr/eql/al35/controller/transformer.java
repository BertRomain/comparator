package fr.eql.al35.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eql.al35.entity.Merchant;
import fr.eql.al35.entity.Offer;
import fr.eql.al35.repository.OfferRepository;

//Java SQL imports

@Controller
public class transformer {

	//	@Autowired
	//	private TransformerIService transformerService; 

	@Autowired
	private OfferRepository offerRepository; 

	//	@RequestMapping("/transformer")
	//    public String getYourPage(Model model) {
	//        model.addAttribute("feed", transformerService.fetchFeed());
	//        return "transformer.html";
	//    }


	@RequestMapping("/transformer")
	public void createOffer() {
		Merchant merchant = new Merchant(6, "Rakuten", "rakuten.jpg", "direct", 0.12);
		Offer offer = new Offer("123456789987DirectRakuten","123456789987", "Toto", "la description", "http://www.toto.com/", 9.99, merchant);
		offerRepository.save(offer);
	}


}	
