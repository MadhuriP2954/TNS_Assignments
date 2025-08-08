package com.tns.banking;

class SavingsAccount extends Account {
	public SavingsAccount() {
        Bank.incrementTotalAccounts();
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: %.2f to Savings Account%n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew: %.2f from Savings Account%n", amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    @Override
    public double getBalance() {
        return balance;
    }

}
