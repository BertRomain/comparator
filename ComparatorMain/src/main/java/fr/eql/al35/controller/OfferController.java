package fr.eql.al35.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eql.al35.entity.Offer;
import fr.eql.al35.iservice.MerchantIService;
import fr.eql.al35.iservice.OfferIService;
import fr.eql.al35.service.OfferServiceDelegate;


@Controller
public class OfferController {

	@Autowired
	private OfferIService offerService;
	
	@Autowired
	private MerchantIService merchantService;
	
	@Autowired
	private OfferServiceDelegate offerServiceDelegate; 
	
	List<Offer> listOffer = new ArrayList<Offer>(); 
	
	  @GetMapping("/offers")
	  public String eanForm(Offer offer, Model model) {	
			List<Offer> listOffers = offerService.findByEan(offer);
			model.addAttribute("offers", listOffers);
			model.addAttribute("merchant", merchantService.findAll());
			return "offers";
	  }

	  @PostMapping("/offers")
	  public String getListById(@ModelAttribute Offer offer, Model model) {
		listOffer = offerServiceDelegate.findByEan(offer);
		Collections.sort(listOffer, 
                (o1, o2) -> o1.getPrice().compareTo(o2.getPrice()));
		model.addAttribute("offers", listOffer);
		model.addAttribute("merchant", merchantService.findAll());
	    return "results";
	  }
}
