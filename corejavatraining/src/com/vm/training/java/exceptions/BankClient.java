package com.vm.training.java.exceptions;

import java.util.*;

public class BankClient {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String st;
		
		try
		{
			Bank hd=new HDFC();
			HDFC hdfc=new HDFC();
			do
			{
				System.out.println();
			System.out.println("Please choose what you want");
			System.out.println("1. Balance enquiery");
			System.out.println("2. Deposit the money");
			System.out.println("3. Withdraw the money");
			System.out.println("4. Money not coming");
			System.out.println("5. Charges for average monthly balance");
			int number=sc.nextInt();
			int mon,amount;
			switch(number)
			{
			case 1:
				int balance=hd.BalanceEnquiery();
				System.out.println("Your remaining balance is :"+balance);
				break;
			case 2:
				System.out.println("Enter the amount you want to deposit");
				amount=sc.nextInt();
				if(amount<=0)
				{
					System.out.println("Please Enter valid amount");
				}
				else
				{
				int bal=hd.Deposit(amount);
				System.out.println("Your remaining balance after depositing the amount is :"+bal);
				
				}
				break;
			case 3:
				System.out.println("Please enter the money you want to withdraw :");
				int am=sc.nextInt();
				mon=hd.Withdraw(am);
				System.out.println("Your remaining balance after withdrawing is :"+mon);
				break;
			case 4:
				System.out.println("Please Enter the number of months you haven't used your account");
				mon=sc.nextInt();
				hd.LastUsage(mon);
				break;
			case 5:
				hd.Monthlycharges();
				mon=hd.BalanceEnquiery();
				System.out.println("Your remaining balance after deducting the charges for Average monthly balance is :"+mon);
				break;
				
			}
			System.out.println();
			System.out.println("Do you still want to chech about your bank (yes/no)");
			st=sc.next();
			}while(st.equals("yes"));
						
		}
		catch(MinimumBalance e)
		{
			e.printStackTrace();
		}
		catch(LowBalance e1)
		{
			e1.printStackTrace();
		}
		catch(MoneyOnHold e2)
		{
			e2.printStackTrace();
		}
		catch(AverageMonthlyBalance e3)
		{
			e3.printStackTrace();
		}
		sc.close();
	}

}
