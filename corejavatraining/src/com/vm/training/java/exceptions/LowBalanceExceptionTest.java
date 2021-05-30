package com.vm.training.java.exceptions;

public class LowBalanceExceptionTest {
	public static void main(String[] args) {
		int balance=900;
		try
		{
			if(balance<1000)
			{
				throw new LowBalanceException("Your balance is less than 1000");
			}
		}
		catch(LowBalanceException e)
		{
			System.out.println(e);
		}
	}

}
