package fr.eql.al35.comparator.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.eql.al35.comparator.entity.Offer;

import fr.eql.al35.comparator.request.OfferRequest;
import fr.eql.al35.comparator.service.OfferService;


@RestController
@RequestMapping(value="/api", headers="Accept=application/json")
public class OfferController {

	@Autowired
	private OfferService offerService;
	
	@PostMapping("/ean/") //localhost:8088/api/ean/
	public List<Offer> getOffer(@RequestBody OfferRequest offerRequest) {
		Offer offer = new Offer();
		BeanUtils.copyProperties(offerRequest, offer);
		return offerService.listOffers(offer.getEan()); 
	}
}
