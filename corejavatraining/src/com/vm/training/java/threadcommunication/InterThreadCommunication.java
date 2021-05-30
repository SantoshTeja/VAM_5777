package com.vm.training.java.threadcommunication;

public class InterThreadCommunication {
public static void main(String[] args) {
    final Customer customer=new Customer();
	Thread t1=new Thread()
	{
		public void run()
		{
			System.out.println(customer.withdraw(7000));
		}
	};
	Thread t2=new Thread()
	{
		public void run()
		{
			System.out.println(customer.deposit(7000));
		}
	};

	t1.setName("Withdraw");
	t2.setName("deposit");
	
	t1.start();
	t2.start();
}
}
