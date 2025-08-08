package com.tns.banking;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create accounts
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();
        // Create a transaction instance
        Transaction transaction = new Transaction();
        // Perform transactions
        transaction.performTransaction(savingsAccount, 1000, true); // Deposit to Savings
        transaction.performTransaction(savingsAccount, 200, false); // Withdraw from Savings
        transaction.performTransaction(checkingAccount, 500, true); // Deposit to Checking
        transaction.performTransaction(checkingAccount, 100, false); // Withdraw from Checking
        // Display total accounts
        System.out.println("Total Accounts: " + Bank.getTotalAccounts());

	}

}
