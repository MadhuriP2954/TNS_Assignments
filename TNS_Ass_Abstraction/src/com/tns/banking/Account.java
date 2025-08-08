package com.tns.banking;

abstract class Account {

	protected double balance;
    public Account() {
        this.balance = 0.0;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
    // Common functionality to display balance
    public void displayBalance() {
        System.out.printf("Current Balance: %.2f%n", getBalance());
    }
}
