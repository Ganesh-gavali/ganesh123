package com.pns.bank.service;

import java.util.List;
import java.util.Map;

import com.pns.bank.model.CustomerDetails;

public interface CustomerDetailsServiceI {

	public CustomerDetails addCustomer(CustomerDetails customerdetails);

	public List<CustomerDetails> getAllCustomer();

	public List<CustomerDetails> deleteById(int customer_id);

	public CustomerDetails update(CustomerDetails customerDetails);

	// All these are for country,state,district,city  ---Start---
	public Map<Integer, String> getCountrys();

	public Map<Integer, String> getStates(int country_id);

	public Map<Integer, String> getDistricts(int state_id);

	public Map<Integer, String> getCitys(int district_id);
	
	//-----End--
	

}
