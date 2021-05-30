package com.vm.training.java.exceptions;

public class MinimumBalance extends Exception{
	String message;

	public MinimumBalance(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return  message;
	}
	

}
