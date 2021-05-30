package com.vm.training.java.basics;

public class ProductDamagedOrMissing extends Exception{
	String message;

	public ProductDamagedOrMissing(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return  message;
	}
	

}
