package com.vm.training.java.newfeatures;


interface Bank
{
	default void OpenAccount()
	{
		System.out.println("DO you want toopena bank account ");
	}
	static void Holiday()
	{
		System.out.println("You can apply holiday");
	}
	abstract int rateofintrest(int interest);
	abstract int minbalance(int balance);
	
}
class Axis implements Bank
{

	@Override
	public int rateofintrest(int interest) {
		// TODO Auto-generated method stub
		return interest;
	}

	@Override
	public int minbalance(int balance) {
		// TODO Auto-generated method stub
		return balance;
	}
	
}
public class NewInterfaceDemo {
	public static void main(String[] args) {
		Bank bank=new Axis();
		bank.OpenAccount();
		System.out.println("Minimm balance is :"+bank.minbalance(1000));
		System.out.println("The rate of interedt is :"+bank.rateofintrest(4));
		Bank.Holiday();
		
	}

}
