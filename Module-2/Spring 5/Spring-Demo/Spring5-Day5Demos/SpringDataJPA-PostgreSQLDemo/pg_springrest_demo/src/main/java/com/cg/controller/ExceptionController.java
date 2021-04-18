package com.cg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleProductNotFoundException(ProductNotFoundException ex) {
		ErrorMessage error = new ErrorMessage();
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		error.setErrorMessage(ex.getMessage());
		return new ResponseEntity(error,HttpStatus.OK);
		
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity handleException(Exception ex) {
		return new ResponseEntity(ex.getMessage(),HttpStatus.BAD_REQUEST);
		
	}

}
