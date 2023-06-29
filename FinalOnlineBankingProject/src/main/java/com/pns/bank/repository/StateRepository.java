package com.pns.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pns.bank.model.State;

/*

@author Rahul Naikwade

*/

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

	public List<State> findByCountryId(int country_id);
	

}
