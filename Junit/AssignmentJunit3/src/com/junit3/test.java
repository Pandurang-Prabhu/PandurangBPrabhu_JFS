package com.junit3;

import org.junit.jupiter.api.Test;
class BankTest {
	BankAccount account = new BankAccount();
	@Test
	void test1() throws InsufficientFundsExpcetion{
		account.withdraw(22002);
	}
	@Test
	void test2() throws InsufficientFundsExpcetion{
		account.withdraw(100);
	}
	@Test
	void test3() throws InsufficientFundsExpcetion{
		account.withdraw(11000);
	}
	@Test
	void test4() throws InsufficientFundsExpcetion{
		account.withdraw(3000);
	}
	@Test
	void test5() throws InsufficientFundsExpcetion{
		account.withdraw(100000);
	}
}
