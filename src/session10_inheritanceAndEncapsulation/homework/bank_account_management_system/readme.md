Bank Account Management System

Imagine you're designing a simple Bank Account management system.
Given the sensitive nature of financial information, you need to make sure that the data of an account
holder is securely encapsulated and cannot be directly accessed or modified without appropriate checks.

Requirements:

Classes:

- BankAccount

Attributes:

- accountHolderName: The name of the account holder.
- accountNumber: A unique identifier for the bank account. This should be automatically
  generated and read-only after account creation.
- balance:The current balance in the account. This should not be directly accessible.

Methods:

- deposit(double amount): Allow a specified amount to be added to the balance. Ensure the deposited amount is positive.
- withdraw(double amount): Allow a specified amount to be subtracted from the balance. Ensure the account has enough
  funds and that the withdrawal amount is positive. If not, print an appropriate error message.
- getBalance(): Return the current balance. This is the only way to access the balance attribute from outside the class.
- getAccountDetails(): Print details about the account, including the account holder's name and account number.

Instructions:

- Use private access modifiers for the attributes to ensure they are not directly accessible from outside the
  BankAccount class.
- Implement public methods to provide controlled access and modification of these attributes.
- Ensure that all methods have necessary checks to protect the integrity of the account data.

Bonus:

Implement a transferFunds(BankAccount targetAccount, double amount) method that allows money to be transferred from one
account to another. Ensure all required checks are in place for a successful transaction.