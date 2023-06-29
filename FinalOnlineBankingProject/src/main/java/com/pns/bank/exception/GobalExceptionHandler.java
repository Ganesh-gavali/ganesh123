package com.pns.bank.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GobalExceptionHandler {
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<String> nullpointerExpHandle(NullPointerException ne) {
		return new ResponseEntity<String>("Given String is null", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<String> noDataFoundExption(NoDataFoundException ndfe) {
		String msg = ndfe.getMessage();
		return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(value = DataIntegrityViolationException.class)
	public ResponseEntity<String> DataIntegrityViolationException(DataIntegrityViolationException ndfe) {

		return new ResponseEntity<String>("Duplicate keys", HttpStatus.BAD_REQUEST);
	}
}