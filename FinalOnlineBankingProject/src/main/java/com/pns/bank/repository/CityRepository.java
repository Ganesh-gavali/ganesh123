package com.pns.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pns.bank.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

public 	List<City> findByDistrictId(int district_id);
	
}
