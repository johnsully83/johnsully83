package com.home.model.wrapper;

import java.math.BigDecimal;
import java.util.Map;

public interface CurrencyWrapper {
	
	public Map<Integer, String> getTimestamps();
	
	public Map<String, String> getCurrencies();
	
	public BigDecimal getValue();

}
