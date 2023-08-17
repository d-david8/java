package codingkata.session1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100.10);
        bankAccount.withdraw(50.27);
        bankAccount.getBalance();
    }

    //depositing method
    public void deposit (double amount) {
        if(isAmountValid(amount)) {
            balance += amount;
            System.out.println("Deposit: " + amount);
        }else {
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(double amount) {
        if(isAmountValid(amount)) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Deposit: " + amount);
            }else {
                System.out.println("Insufficient funds.");
            }
        }
        else {
            System.out.println("Invalid amount.");
        }
    }
    public double getBalance(){
        System.out.println("Your balance is: " + balance);
        return balance;
    }
    private boolean isAmountValid(double value){
        return value >=0;
    }

}
