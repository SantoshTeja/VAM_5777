package com.vm.training.java.exceptions;

public class LowBalance extends Exception{
String message;

public LowBalance(String message) {
	super();
	this.message = message;
}

@Override
public String toString() {
	return message;
}

}
