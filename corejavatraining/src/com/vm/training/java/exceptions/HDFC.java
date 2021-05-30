package com.vm.training.java.exceptions;

public class HDFC implements Bank
{
	public int balance=10000;

	@Override
	public int Monthlycharges() throws AverageMonthlyBalance{
		// TODO Auto-generated method stub
		balance=balance-10;
		throw new AverageMonthlyBalance("Average monthly balances charges have been deducted from you bank account");
	}

	@Override
	public int BalanceEnquiery() throws MinimumBalance{
		// TODO Auto-generated method stub
		if(balance<1000)
		{
			throw new MinimumBalance("Your balance is less than minimum balance. Please maintain minimum balance");
		}
		else
		{
			return balance;
		}
	}

	@Override
	public int Withdraw(int amount) throws LowBalance,MinimumBalance{
		// TODO Auto-generated method stub
		if((balance-amount)>1000)
		{
			balance-=amount;
			return balance;		
		}
		else if((balance-amount)<=1000&&(balance-amount)>0)
		{
			throw new MinimumBalance("If you are withdrawing then you're balance is less than the minimum balance, Please check your balance");
		}
		else
		{
			throw new LowBalance("You are having low balance you cannot withdraw the amount");
		}
	
	}

	@Override
	public void LastUsage(int months) throws MoneyOnHold{
		// TODO Auto-generated method stub
		if(balance<1000&&months>=3)
		{
			throw new MoneyOnHold("Your money is onhold because you're not using your account for more than 3 months and not maintaining minimum balance");
		}
		else if(months>=3)
		{
			throw new MoneyOnHold("Your money is onhold because you're not using your account for more than 3 months");
		}
		else
		{
			throw new MoneyOnHold("Your money is onhold because of not maintaining minimum balance for more than 3 months");
		}
	}

	@Override
	public int Deposit(int amount) {
		// TODO Auto-generated method stub
		balance=amount+balance;
		return balance;
	}


}

