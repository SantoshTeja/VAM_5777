package com.vm.training.java.CoreJavaCodingTest;
import java.util.*;
import java.io.*;
public class SavingsAccount {
int balance;
int interest;
public SavingsAccount(int balance, int interest) {
	super();
	this.balance = balance;
	this.interest = interest;
}

public void withDraw(int amount)
{
	if(amount>balance)
	{
		System.out.println("your balance is very low");
	}
	else
	{
	      balance-=amount;
	}

}
public void deposit(int amount)
{
	balance+=amount;
}

public void display()
{
	System.out.println("Your Current balance is :"+balance);
}
}
