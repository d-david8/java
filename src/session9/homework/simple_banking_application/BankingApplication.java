package session9.homework.simple_banking_application;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Dan David", "savings", 1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);
        account.deposit(100.0);
        account.withdraw(1500.0);

        System.out.println("Current balance: " + account.getBalance());
        account.printTransactionSummary();
    }
}
