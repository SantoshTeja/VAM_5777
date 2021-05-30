package com.vm.training.java.exceptions;

public class CheckedExceptionsExample {
	public static void main(String[] args) {
		try {
			int i[]= {1,2};
			System.out.println(i[2]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("We are in finally block");
		}
		
	}

}
