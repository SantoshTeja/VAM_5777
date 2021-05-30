package com.vm.training.java.exceptions;

public class LowBalanceException extends Exception{
	String message;
	public LowBalanceException(String message) {
		this.message = message;
	}


	public String toString() {
		return message;

	
	}
}
