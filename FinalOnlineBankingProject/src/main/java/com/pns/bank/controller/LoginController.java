package com.pns.bank.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pns.bank.config.EmailConfig;

@RestController
public class LoginController {

	Random random = new Random(1000);
	@Autowired
	private EmailConfig emailconfig;

	@PostMapping("/getotp")
	public int sendOtp() {

		int otp = random.nextInt(9999);

		
		  String body = "one time password \n don't share to anyone=" + otp + "";
		  
		  String toEmail = "gavaliganesh29@gmail.com";
		  
		  this.emailconfig.sendEmail(toEmail, "otp", body);
		  
		
		return otp;
		 
	
	}

}
