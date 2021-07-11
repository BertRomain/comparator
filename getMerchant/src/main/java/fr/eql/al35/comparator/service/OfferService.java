package fr.eql.al35.comparator.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eql.al35.comparator.dao.MerchantDao;
import fr.eql.al35.comparator.dao.OfferDao;
import fr.eql.al35.comparator.entity.Offer;


@Service
@Transactional //aller verifier pq là ya un transactionnal 
public class OfferService implements OfferIService {

	@Autowired
	private OfferDao offerDao;

	@Autowired
	private MerchantDao merchantDao;

	@Override
	public List<Offer> listOffers(Integer EAN) {
		List<Offer> listOffers = (List<Offer>) offerDao.findById(EAN).get();
		return listOffers;
	}

}
