package com.example.comtrollers;

public class BookIdMismatchException extends RuntimeException {
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	public BookIdMismatchException() {
        super();
    }
	
	public BookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
	
    public BookIdMismatchException(String message) {
        super(message);
    }
    public BookIdMismatchException(Throwable cause) {
        super(cause);
    }
}