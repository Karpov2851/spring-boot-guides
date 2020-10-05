package com.ws.ws;

import com.ws.constants.ConfigConstants;
import com.ws.entities.*;
import com.ws.model.CountryMstr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.ws.service.CountryService;

@Endpoint
public class CountryEndpoint {


	private CountryService countryService;

	@Autowired
	public CountryEndpoint(CountryService countryService) {
		this.countryService = countryService;
	}

	@PayloadRoot(namespace = ConfigConstants.NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
		GetCountryResponse response = new GetCountryResponse();
		try{
			CountryMstr countryMstr = countryService.findByName(request.getName());
			Country ct = new Country();
			ct.setName(countryMstr.getName());
			ct.setCapital(countryMstr.getCapital());
			ct.setCurrency(Currency.fromValue(countryMstr.getCurrency()));
			ct.setPopulation(Integer.parseInt(countryMstr.getPopulation()));
			response.setCountry(ct);
		}catch(Exception e){

		}
		return response;
	}

	@PayloadRoot(namespace = ConfigConstants.NAMESPACE_URI, localPart = "createCountry")
	@ResponsePayload
	public GetCountryResponse createCountry(@RequestPayload CreateCountry request) {
		GetCountryResponse response = new GetCountryResponse();


		return response;
	}
}
