/**
 * 
 */
package com.quiz.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class AppException extends RuntimeException {

	public AppException(String message) {
		super(message);
	}
}
