package fr.eql.al35.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import fr.eql.al35.entity.Offer;
import fr.eql.al35.iservice.OfferIService;

@Service
public class OfferServiceDelegate implements OfferIService{

	private RestTemplate restTemplate;
	private String baseURLEanRequest = "http://localhost:8088/api/ean/";
	private URI url = URI.create(baseURLEanRequest);


	public OfferServiceDelegate() {
		restTemplate = initRestTemplate();
	}
	
	public RestTemplate initRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
		if (CollectionUtils.isEmpty(interceptors)) {
			interceptors = new ArrayList<ClientHttpRequestInterceptor>();
		}
		interceptors.add(new RestTemplateHeaderModifierInterceptor());
		restTemplate.setInterceptors(interceptors);
		return restTemplate;
	}
	
	@Override
	public List<Offer> findAll() {
		return null;
	}

	
	@Override
	public List<Offer> findByEan(Offer offer) {
		Offer[] tabOffers = restTemplate.postForObject(url,offer, Offer[].class);
		return Arrays.asList(tabOffers);
	}


	@Override
	public Offer existByEan(Offer offer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Offer findByEanAndMerchant(Offer offer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mergeOffer(Offer offer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertOnDuplicateKey(Offer offer) {
		// TODO Auto-generated method stub
		
	}

}
