package session9_oopConcepts.homework.simple_banking_application;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountName;
    private String description;
    private double balance;
    private List<Transaction> transactions;

    public BankAccount(String accountName, String description, double initialDeposit) {
        this.accountName = accountName;
        this.description = description;
        this.balance = initialDeposit;
        this.transactions = new ArrayList<>();
        transactions.add(new Transaction("Initial Deposit", initialDeposit, balance));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount, balance));
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", -amount, balance));
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionSummary() {
        System.out.println("Transaction Summary for account: " + accountName);
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
