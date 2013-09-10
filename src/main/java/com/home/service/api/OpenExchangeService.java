package com.home.service.api;

import java.util.Map;

import com.home.model.openexchange.OpenExchangeLatestRates;

public interface OpenExchangeService {
	
	public OpenExchangeLatestRates getLatestRates();
	
	public Map<String, String> getCurrencies();

}
