package com.vm.training.java.exceptions;

public interface Bank {
	public int Monthlycharges() throws AverageMonthlyBalance;
	public int BalanceEnquiery() throws MinimumBalance;
	public int Withdraw(int amount) throws LowBalance,MinimumBalance;
	public void LastUsage(int months) throws MoneyOnHold;
	public int Deposit(int amount);

}
