import java.util.Scanner;

class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 4.5;

    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    void displayInterest() {
        double interest = (balance * interest_rate) / 100;
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Interest Earned: " + interest);
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest rate updated to: " + interest_rate + "%");
    }
}

public class pra10 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 10000);
        BankAccount acc2 = new BankAccount("Bob", 25000);
        acc1.displayInterest();
        acc2.displayInterest();
        BankAccount.updateInterestRate(6.0);
        acc1.displayInterest();
        acc2.displayInterest();
    }
}
