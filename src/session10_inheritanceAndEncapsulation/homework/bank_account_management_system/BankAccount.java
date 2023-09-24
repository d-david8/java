package session10_inheritanceAndEncapsulation.homework.bank_account_management_system;

import java.util.UUID;

public class BankAccount {
    private final String accountHolderName;
    private final UUID accountNumber;
    private double balance;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = UUID.randomUUID();
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Account: " + accountNumber + " deposit: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Account: " + accountNumber + " withdrawal : " + amount);
            } else {
                System.out.println("Insufficient funds to make the withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountDetails() {
        return "Account Holder Name: " + accountHolderName + "\n" +
                "Account Number: " + accountNumber + "\n" +
                "Current Balance: " + balance;
    }

    public void transferFunds(BankAccount targetAccount, double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                targetAccount.deposit(amount);
                System.out.println("Transferred: " + amount + " to account: " + targetAccount.accountNumber);
            } else {
                System.out.println("Insufficient funds to make the transfer.");
            }
        } else {
            System.out.println("Invalid transfer amount. Amount must be positive.");
        }
    }
}
