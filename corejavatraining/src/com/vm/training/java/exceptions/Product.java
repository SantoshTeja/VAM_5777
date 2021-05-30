package com.vm.training.java.exceptions;

import java.util.Scanner;

import com.vm.training.java.basics.ProductDamagedOrMissing;

public class Product {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Is the product recieved(yes/no)");
		String notrecieved=sc.nextLine();
		System.out.println("Is the product damaged or missed(yes/no)");
		String Damaged=sc.nextLine();
		System.out.println("is the delivery days exceeded(yes/no)");
		String exceeded=sc.nextLine();
		try
		{
			if(notrecieved.equals("no"))
			{
				throw new ProductNotRecieved("We will deliver the product as soon as possible");
			}
			else
			{
				System.out.println("Enjoy the product");
			}
		}
		catch(ProductNotRecieved e)
		{
			e.printStackTrace();
		}
		
		try {
			if(Damaged.equals("no"))
			{
				throw new ProductDamagedOrMissing("We will deliver another product");
			}
			else
			{
				System.out.println("Enjoy the product");
			}
		}
		catch(ProductDamagedOrMissing e1)
		{
			e1.printStackTrace();
		}

		try
		{
			if(exceeded.equals("no"))
			{
				throw new ExceededMaxNoOfDays("We will refund the amount you paid for the product");
			}
			else
			{
				System.out.println("Enjoy the product");
			}
		}
		
		catch(ExceededMaxNoOfDays e2)
		{
			e2.printStackTrace();
		}

	}

}
