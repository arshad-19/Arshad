
package com.project.exception;

public class ValidateException extends Exception {

	/**
	 * @param message
	 * @param cause
	 */
	public ValidateException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * @param message
	 */
	public ValidateException(String message) {
		super(message);
		
	}
	

}
