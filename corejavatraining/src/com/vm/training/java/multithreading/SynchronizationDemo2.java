package com.vm.training.java.multithreading;

import java.util.*;

class Account
{
	public void withdraw(int time)
	{
		synchronized(this)
		{
			for(int i=1;i<=time;i++)
			{
		System.out.println(Thread.currentThread().getName()+" is updating ");
			}
		}
	}
}


class Transaction implements Runnable
{
	Account account=new Account();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.withdraw(5);
		
	}
	
}
public class SynchronizationDemo2 {
	public static void main(String[] args) {
		
		
		Transaction trans=new Transaction();
		Thread santosh=new Thread(trans);
		Thread teja=new Thread(trans);
		
		santosh.setName("WithDraw");
		teja.setName("Deposit");
		
		santosh.start();
		teja.start();
	}

}
