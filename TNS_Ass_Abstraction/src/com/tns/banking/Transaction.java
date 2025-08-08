package com.tns.banking;

class Transaction {
	private final double transactionFee = 2.50; // Fixed transaction fee
    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount + transactionFee); // Deduct transaction fee on withdrawal
        }
        account.displayBalance();
    }
}
