package fr.eql.al35.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.eql.al35.entity.Offer;

@Repository
@Transactional
public interface OfferIRepository extends CrudRepository<Offer, Integer> {

}
