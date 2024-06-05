package fr.eql.al35.comparator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.eql.al35.comparator.entity.Offer;


public interface OfferDao extends CrudRepository<Offer, String> {
	
	@Query("Select o FROM offer o WHERE o.ean = :ean")
	List<Offer> findByEan(@Param("ean") String ean);
	
}
