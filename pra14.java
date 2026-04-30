import java.util.Scanner;

class BankAccount14 {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
        System.out.println("Account opened for " + accountHolderName);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount14 {
    double interestRate = 4.0;

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest on Savings: " + interest);
    }
}

class FixedDepositAccount extends BankAccount14 {
    int years;
    double fdRate = 7.5;

    void setYears(int y) { years = y; }

    void maturityAmount() {
        double amount = balance * Math.pow(1 + fdRate / 100, years);
        System.out.printf("Maturity Amount after %d years: %.2f%n", years, amount);
    }
}

public class pra14 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount(101, "Alice", 5000);
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.checkBalance();
        sa.calculateInterest();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(201, "Bob", 10000);
        fd.setYears(3);
        fd.maturityAmount();
    }
}
