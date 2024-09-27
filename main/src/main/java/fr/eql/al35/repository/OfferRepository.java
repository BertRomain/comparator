package fr.eql.al35.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.eql.al35.entity.Offer;

@Repository
public interface OfferRepository extends CrudRepository<Offer, Integer> {
	
	
}
