package com.vm.training.java.exceptions;

public class MoneyOnHold extends Exception{
	String message;

	public MoneyOnHold(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
	

}
