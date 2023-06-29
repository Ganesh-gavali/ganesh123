
  package com.pns.bank.repository;
  
  import org.springframework.data.jpa.repository.JpaRepository;

import com.pns.bank.model.Branch;
  
  public interface BranchRepository extends JpaRepository<Branch, Integer> {
  
  }
 