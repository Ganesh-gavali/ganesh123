package com.pns.bank.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pns.bank.model.City;
import com.pns.bank.model.Country;
import com.pns.bank.model.CustomerDetails;
import com.pns.bank.model.District;
import com.pns.bank.model.State;
import com.pns.bank.repository.CityRepository;
import com.pns.bank.repository.CountryRepository;
import com.pns.bank.repository.CustomerDetailsRepository;
import com.pns.bank.repository.DistrictRepository;
import com.pns.bank.repository.StateRepository;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsServiceI {
	@Autowired
	private CustomerDetailsRepository customerDetailRepo;

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private DistrictRepository districtRepository;

	@Autowired
	private CityRepository cityRepository;

	@Override
	public CustomerDetails addCustomer(CustomerDetails customerdetails) {
		return customerDetailRepo.save(customerdetails);
	}

	@Override
	public List<CustomerDetails> getAllCustomer() {
		return customerDetailRepo.findAll();
	}

	@Override
	public List<CustomerDetails> deleteById(int customer_id) {
		customerDetailRepo.deleteById(customer_id);
		List<CustomerDetails> customerList = getAllCustomer();
		return customerList;
	}

	@Override
	public CustomerDetails update(CustomerDetails customerDetails) {
		return customerDetailRepo.save(customerDetails);
	}

	@Override
	public Map<Integer, String> getCountrys() {
		List<Country> listOfCountry = countryRepository.findAll();
		Map<Integer, String> countryMap = new HashMap<Integer, String>();

		for (Country country : listOfCountry) {
			countryMap.put(country.getCountryId(), country.getCountryName());

		}

		return countryMap;
	}

	@Override
	public Map<Integer, String> getStates(int country_id) {
		List<State> listOfState = stateRepository.findByCountryId(country_id);
		Map<Integer, String> stateMap = new HashMap<Integer, String>();

		for (State state : listOfState) {
			stateMap.put(state.getStateId(), state.getStateName());
		}
		return stateMap;
	}

	@Override
	public Map<Integer, String> getDistricts(int state_id) {
		List<District> listOfDistrict = districtRepository.findByStateId(state_id);
		Map<Integer, String> districtMap = new HashMap<Integer, String>();

		for (District dist : listOfDistrict) {
			districtMap.put(dist.getDistrictId(), dist.getDistrictName());
		}
		return districtMap;
	}

	@Override
	public Map<Integer, String> getCitys(int district_id) {
		List<City> listOfCity = cityRepository.findByDistrictId(district_id);
		Map<Integer, String> cityMap = new HashMap<Integer, String>();

		for (City city : listOfCity) {

			cityMap.put(city.getCityId(), city.getCityName());
		}
		return cityMap;
	}
}
