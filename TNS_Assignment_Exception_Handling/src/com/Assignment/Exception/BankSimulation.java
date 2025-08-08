package com.Assignment.Exception;

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, 1000.00); // Initial account setup
        account.displayBalance();

        // Try depositing a valid amount
        try {
            account.deposit(500);
        } catch (InvalidAmountException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Try withdrawing a valid amount
        try {
            account.withdraw(300);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Try depositing an invalid amount
        try {
            account.deposit(-50);
        } catch (InvalidAmountException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Try withdrawing more than available balance
        try {
            account.withdraw(2000);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}