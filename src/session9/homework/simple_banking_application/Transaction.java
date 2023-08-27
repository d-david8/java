package session9.homework.simple_banking_application;

public class Transaction {
    private String transactionType;
    private double transactionAmount;
    private double availableBalance;

    public Transaction(String transactionType, double transactionAmount, double availableBalance) {
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.availableBalance = availableBalance;
    }

    @Override
    public String toString() {
        return transactionType + " in amount of " + transactionAmount + " balance after " + availableBalance;
    }
}
