package fr.eql.al35.iservice;

import java.util.List;

import fr.eql.al35.entity.Offer;

public interface OfferIService {

	public List<Offer> findAll();
	public List<Offer> findByEan();
	List<Offer> findByEan(Offer offer); 
}
