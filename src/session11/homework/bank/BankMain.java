package session11.homework.bank;

public class BankMain {

    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.deposit(100);
        bankB.deposit(150);
        bankC.deposit(200);

        System.out.println("Bank A Balance: $" + bankA.getBalance());
        System.out.println("Bank B Balance: $" + bankB.getBalance());
        System.out.println("Bank C Balance: $" + bankC.getBalance());
    }
}
