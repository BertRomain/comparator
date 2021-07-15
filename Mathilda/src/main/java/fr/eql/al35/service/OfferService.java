package fr.eql.al35.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eql.al35.entity.Offer;
import fr.eql.al35.iservice.OfferIService;

@Service
public class OfferService implements OfferIService{

	@Override
	public List<Offer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Offer> findByEan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Offer> findByEan(Offer offer) {
		// TODO Auto-generated method stub
		return null;
	}

}
