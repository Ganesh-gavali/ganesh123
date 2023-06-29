package com.pns.bank.controller;



import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pns.bank.model.CustomerDetails;
import com.pns.bank.service.CustomerDetailsServiceI;

@RestController
public class CustomerlDetailController {
	
	@Autowired
	private CustomerDetailsServiceI p_d_ser;

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@PostMapping("/addDetails")
	public CustomerDetails addDetails(@RequestBody CustomerDetails customerDetails) {
		return p_d_ser.addCustomer(customerDetails);
	}

	@GetMapping("/getcountry")
	public Map<Integer, String> getAllCountry() {

		return p_d_ser.getCountrys();
	}

	@GetMapping("/getstatebycountryId/{country_id}")
	public Map<Integer, String> getAllState(@PathVariable int country_id) {

		return p_d_ser.getStates(country_id);
	}

	@GetMapping("/getdistrictbystateId/{state_id}")
	public Map<Integer, String> getAllDistrict(@PathVariable int state_id) {
		return p_d_ser.getDistricts(state_id);
	}

	@GetMapping("/getcountry/{city_id}")
	public Map<Integer, String> getAllCity(@PathVariable int city_id) {
		return p_d_ser.getCitys(city_id);
	}

	@GetMapping("/getAll")
	public List<CustomerDetails> getAllCustomerD() {
		List<CustomerDetails> listCustomerD = p_d_ser.getAllCustomer();
		return listCustomerD;
	}

	@DeleteMapping("/Delete/{customer_id}")
	public List<CustomerDetails> deleteById(@PathVariable int customer_id) {
		p_d_ser.deleteById(customer_id);
		List<CustomerDetails> listCustomer = getAllCustomerD();
		return listCustomer;
	}

	@PutMapping("/update")
	public CustomerDetails update(@RequestBody CustomerDetails customerDetails) {
		return p_d_ser.update(customerDetails);
	}
}
