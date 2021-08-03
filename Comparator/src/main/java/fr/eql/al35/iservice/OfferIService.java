package fr.eql.al35.iservice;

import java.util.List;

import fr.eql.al35.entity.Offer;

public interface OfferIService {

	public List<Offer> findAll(); //trouve tous les produits
	List<Offer> findByEan(Offer offer); //trouve un produit par son EAN
	public Offer existByEan(Offer offer);
	public Offer findByEanAndMerchant(Offer offer); 
	public void mergeOffer (Offer offer);
	public void insertOnDuplicateKey(Offer offer);
}
