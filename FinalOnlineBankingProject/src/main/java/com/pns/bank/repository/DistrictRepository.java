package com.pns.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pns.bank.model.District;
/*

@author Rahul Naikwade

*/
@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

	public List<District> findByStateId(int state_id);

}
