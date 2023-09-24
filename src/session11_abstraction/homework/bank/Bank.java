package session11_abstraction.homework.bank;

abstract class Bank {
    protected double balance;

    abstract double getBalance();

    public void deposit(double amount) {
        balance += amount;
    }
}
