package com.vm.training.java.exceptions;

public class ExceededMaxNoOfDays extends Exception{

	String message;

	public ExceededMaxNoOfDays(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return  message;
	}
	
}
