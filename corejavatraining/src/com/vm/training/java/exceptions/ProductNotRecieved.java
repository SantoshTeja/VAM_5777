package com.vm.training.java.exceptions;

public class ProductNotRecieved extends Exception{
	
	String message;

	public ProductNotRecieved(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
	
	

}
