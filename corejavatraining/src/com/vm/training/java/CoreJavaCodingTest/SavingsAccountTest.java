package com.vm.training.java.CoreJavaCodingTest;

import java.util.Scanner;

public class SavingsAccountTest {

	public static void main(String[] args) {
		// T ODO Auto-generated method stub

		//SavingsAccount account=new SavingsAccount();
		System.out.println("Hello Welcome to the bank ");
		System.out.println("Do you want to create the savings account(yes\no) ");
		Scanner sc=new Scanner(System.in);
		String option=sc.next();
		if(option.equals("yes"))
		{
		     SavingsAccount account=new SavingsAccount(1000,5);
		     account.deposit(7000);
		     System.out.println("After depositing the amount your remaining balance is :");
		     account.display();
		     System.out.println("After Withdrawing the amount your remaining balance is :");
		     account.withDraw(5000);
		}
		else
		{
			System.out.println("You can go to another counter");
		}
		
	}

}
