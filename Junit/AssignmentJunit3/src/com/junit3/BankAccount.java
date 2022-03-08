package com.junit3;

public class BankAccount {
	private double balance = 20000;
	public double withdraw(double amount) throws InsufficientFundsExpcetion
	{
		if(amount > balance)
		{	
throw new InsufficientFundsExpcetion();
		}
		else {
			balance-=amount;
		}
		return balance; 
	}
}
