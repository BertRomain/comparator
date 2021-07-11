package fr.eql.al35.comparator.entity;

import java.io.Serializable;
import java.net.URL;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Offer implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id; 
	private Integer EAN;
	private String productName;
	private String decription;
	private URL url;
	private Double price;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "merchant_id")
	private Merchant merchant;
	
	public Offer() {
		super();
	}
	
	public Offer(Integer ean, String productName, String decription, URL url, Double price, Merchant merchant) {
		super();
		this.EAN = ean;
		this.productName = productName;
		this.decription = decription;
		this.url = url;
		this.price = price;
		this.merchant = merchant;
	}

	@Override
	public String toString() {
		return "Product [ean=" + EAN + ", productName=" + productName + ", decription=" + decription + ", url=" + url
				+ ", price=" + price + "]";
	}

	public Integer getEan() {
		return EAN;
	}

	public void setEan(Integer ean) {
		this.EAN = ean;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((decription == null) ? 0 : decription.hashCode());
		result = prime * result + ((EAN == null) ? 0 : EAN.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Offer other = (Offer) obj;
		if (decription == null) {
			if (other.decription != null)
				return false;
		} else if (!decription.equals(other.decription))
			return false;
		if (EAN == null) {
			if (other.EAN != null)
				return false;
		} else if (!EAN.equals(other.EAN))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	





}
