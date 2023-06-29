package com.pns.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pns.bank.model.CustomerDetails;


@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer> {

}
