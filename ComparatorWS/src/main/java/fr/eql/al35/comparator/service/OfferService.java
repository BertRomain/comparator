package fr.eql.al35.comparator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eql.al35.comparator.entity.Offer;
import fr.eql.al35.comparator.repository.OfferDao;


@Service
public class OfferService implements OfferIService {

	@Autowired
	private OfferDao offerDao;


	@Override
	public List<Offer> listOffers(String EAN) {
		List<Offer> listOffers = (List<Offer>) offerDao.findByEan(EAN);
		return listOffers;
	}

}
