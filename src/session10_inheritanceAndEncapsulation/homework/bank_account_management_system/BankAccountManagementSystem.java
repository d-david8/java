package session10_inheritanceAndEncapsulation.homework.bank_account_management_system;

public class BankAccountManagementSystem {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Mihai");
        BankAccount account2 = new BankAccount("David");

        System.out.println("First account:");
        account1.deposit(1000);
        account1.withdraw(500);
        System.out.println(account1.getAccountDetails());
        System.out.println();

        System.out.println("Second account:");
        account2.deposit(2000);
        System.out.println(account2.getAccountDetails());
        System.out.println();

        double amountToTransfer = 300;
        System.out.println("Transferred the amount " + amountToTransfer + " from first account in second account");
        account1.transferFunds(account2, 300);
        System.out.println(account1.getAccountDetails());
        System.out.println(account2.getAccountDetails());
    }
}
