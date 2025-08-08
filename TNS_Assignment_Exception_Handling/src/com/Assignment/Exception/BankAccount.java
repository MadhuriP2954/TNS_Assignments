package com.Assignment.Exception;

//Custom exception for insufficient balance
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Custom exception for invalid deposit or withdrawal amount
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}

//BankAccount class simulates a basic bank account
class BankAccount {
 private int accountNumber;
 private double balance;

 // Parameterized constructor
 public BankAccount(int accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be positive.");
     }
     balance += amount;
     System.out.println("Deposited: ₹" + amount);
 }

 
 public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be positive.");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient balance. Cannot withdraw ₹" + amount);
     }
     balance -= amount;
     System.out.println("Withdrawn: ₹" + amount);
 }

 /**
  * Method to display the current account balance.
  */
 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber + ", Current Balance: ₹" + balance);
 }
}