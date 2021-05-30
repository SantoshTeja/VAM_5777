package com.vm.training.java.threadcommunication;

public class Customer {
public int balance=1000;

synchronized public int withdraw(int amount)
{
	if(amount>balance)
	{
		System.out.println("You dont have sufficient balance ");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	balance-=amount;
	System.out.println(Thread.currentThread().getName()+ " is withdrawing the money ");
	return balance;
}

synchronized public int deposit(int amount)
{
	balance+=amount;
	System.out.println(Thread.currentThread().getName()+" is depositing the money ");
	//notifyAll();
	return balance;
	
}
}
