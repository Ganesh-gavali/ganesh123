package com.pns.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pns.bank.model.Country;

/*

@author Rahul Naikwade

*/

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
		

}
