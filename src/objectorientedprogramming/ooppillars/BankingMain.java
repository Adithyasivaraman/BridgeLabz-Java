import java.util.*;

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(int acc, String name, double bal) {
        super(acc, name, bal);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Savings Account Loan Applied");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(int acc, String name, double bal) {
        super(acc, name, bal);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Current Account Loan Applied");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}

public class BankingMain {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(101, "Adi", 50000));
        accounts.add(new CurrentAccount(102, "Rahul", 30000));

        for (BankAccount acc : accounts) {
            System.out.println("Interest: " + acc.calculateInterest());
        }
    }
}
