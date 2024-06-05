package fr.eql.al35.comparator.response;

import java.io.Serializable;
import java.net.URL;

import fr.eql.al35.comparator.entity.Merchant;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class OfferResponse implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private String ean;
	private String productName;
	private String description;
	private URL url;
	private Double price;
	private Merchant merchant;
	 
}
