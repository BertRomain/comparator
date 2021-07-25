package fr.eql.al35.service;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.eql.al35.entity.Offer;
import fr.eql.al35.iservice.OfferIService;

@Transactional
@Service
public class OfferService implements OfferIService{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Offer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Offer> findByEan(Offer offer) {
	return null;
	}


	@Override
	public Offer findByEanAndMerchant(Offer offer) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void mergeOffer(Offer offer) {
	Query query = em.createQuery("SELECT o FROM offer o WHERE o.ean = :paramean AND o.merchant = :parammerchant");
	query.setParameter("paramean", offer.getEan());
	query.setParameter("parammerchant", offer.getMerchant());
	Offer retrievedOffer = (Offer) query.getSingleResult();
	LocalDate localDate = LocalDate.now();
	if (offer.getProductName() != retrievedOffer.getProductName()) {
		retrievedOffer.setProductName(offer.getProductName());
		retrievedOffer.setModifyDate(localDate);
	}
	if (offer.getUrl() != retrievedOffer.getUrl()) {
		retrievedOffer.setUrl(offer.getUrl());
		retrievedOffer.setModifyDate(localDate);
	}
	if (offer.getPrice() != retrievedOffer.getPrice()) {
		retrievedOffer.setPrice(offer.getPrice());
		retrievedOffer.setModifyDate(localDate);
	}
	if (offer.getDescription() != retrievedOffer.getDescription()) {
		retrievedOffer.setDescription(offer.getDescription());
		retrievedOffer.setModifyDate(localDate);
	}
	em.merge(retrievedOffer);
		}


	@Override
	public Offer existByEan(Offer offer) {
		Query query = em.createQuery("SELECT o FROM offer o WHERE o.ean = :paramean AND o.merchant = :parammerchant");
		query.setParameter("paramean", offer.getEan());
		query.setParameter("parammerchant", offer.getMerchant());
		try {
			Offer retrievedOffer = (Offer) query.getSingleResult();
			return retrievedOffer;
		} catch (NoResultException nre) {
		}
		return null;
	}

}
