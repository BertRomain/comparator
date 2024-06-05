package fr.eql.al35.comparator.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "offer")
public class Offer implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	private String id; 
	private String ean;
	private String productName;
	@Column(length = 15000)
	private String description;
	
	@Column(length = 500)
	private String url;
	private Double price;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch= FetchType.LAZY)
	@JoinColumn(name = "merchant_id")
	private Merchant merchant;

	private LocalDate createDate;
	private LocalDate modifyDate;
	
	public Offer() {
		super();
	}

	public Offer(String id, String ean, String productName, String description, String url, Double price,
			Merchant merchant, LocalDate createDate, LocalDate modifyDate) {
		super();
		this.id = id;
		this.ean = ean;
		this.productName = productName;
		this.description = description;
		this.url = url;
		this.price = price;
		this.merchant = merchant;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
	}
	
	

	public Offer(String ean, String productName, String description, String url, Double price, Merchant merchant) {
		super();
		this.ean = ean;
		this.productName = productName;
		this.description = description;
		this.url = url;
		this.price = price;
		this.merchant = merchant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createDate, description, ean, id, merchant, modifyDate, price, productName, url);
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
		return Objects.equals(createDate, other.createDate) && Objects.equals(description, other.description)
				&& Objects.equals(ean, other.ean) && Objects.equals(id, other.id)
				&& Objects.equals(merchant, other.merchant) && Objects.equals(modifyDate, other.modifyDate)
				&& Objects.equals(price, other.price) && Objects.equals(productName, other.productName)
				&& Objects.equals(url, other.url);
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", ean=" + ean + ", productName=" + productName + ", description=" + description
				+ ", url=" + url + ", price=" + price + ", merchant=" + merchant + ", createDate=" + createDate
				+ ", modifyDate=" + modifyDate + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
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

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(LocalDate modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	
}
