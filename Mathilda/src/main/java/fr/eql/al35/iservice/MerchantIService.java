package fr.eql.al35.iservice;

import java.util.List;

import fr.eql.al35.entity.Merchant;

public interface MerchantIService {

	public List<Merchant> findAll();
	public Merchant findById(); 
}
