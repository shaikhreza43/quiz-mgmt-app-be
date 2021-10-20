/**
 * 
 */
package com.quiz.app.exceptions;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.http.HttpStatus;

/**
 * @author Shaikh Ahmed Reza
 *
 */
public class ErrorDetails {

	private Timestamp timestamp;
	private int statusCode;
	private HttpStatus statusMessage;
	private List<String> errorDetails;

	/**
	 * @return the timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the statusMessage
	 */
	public HttpStatus getStatusMessage() {
		return statusMessage;
	}

	/**
	 * @param statusMessage the statusMessage to set
	 */
	public void setStatusMessage(HttpStatus statusMessage) {
		this.statusMessage = statusMessage;
	}

	/**
	 * @return the errorDetails
	 */
	public List<String> getErrorDetails() {
		return errorDetails;
	}

	/**
	 * @param errorDetails the errorDetails to set
	 */
	public void setErrorDetails(List<String> errorDetails) {
		this.errorDetails = errorDetails;
	}

	/**
	 * @param timestamp
	 * @param statusCode
	 * @param statusMessage
	 * @param errorDetails
	 */
	public ErrorDetails(Timestamp timestamp, int statusCode, HttpStatus statusMessage, List<String> errorDetails) {
		super();
		this.timestamp = timestamp;
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.errorDetails = errorDetails;
	}

	/**
	 * 
	 */
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
