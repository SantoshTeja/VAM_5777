package com.vm.training.java.exceptions;

public class AverageMonthlyBalance extends Exception{
	String message;

	public AverageMonthlyBalance(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
	

}
