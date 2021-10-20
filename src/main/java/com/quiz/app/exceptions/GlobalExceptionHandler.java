/**
 * 
 */
package com.quiz.app.exceptions;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(AppException.class)
	public ResponseEntity<Object> handleException(AppException ex) {

		List<String> errors = new ArrayList<String>();
		errors.add(ex.getMessage());

		ErrorDetails err = new ErrorDetails(new Timestamp(System.currentTimeMillis()),
				HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR, errors);

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(err);
	}

}