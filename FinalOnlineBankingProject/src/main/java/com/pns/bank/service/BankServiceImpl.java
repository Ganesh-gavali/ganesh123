
package com.pns.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pns.bank.repository.BankRepository;

@Service
public class BankServiceImpl {

	@SuppressWarnings("unused")
	@Autowired
	private BankRepository bankRepository;

}
