class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Savings Account with Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(int accNo, double balance, int limit) {
        super(accNo, balance);
        this.withdrawalLimit = limit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Checking Account with Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenure;

    FixedDepositAccount(int accNo, double balance, int tenure) {
        super(accNo, balance);
        this.tenure = tenure;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account with Tenure: " + tenure + " years");
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount(101, 50000, 4.5);
        BankAccount a2 = new CheckingAccount(102, 30000, 5);
        BankAccount a3 = new FixedDepositAccount(103, 100000, 3);

        a1.displayAccountType();
        a2.displayAccountType();
        a3.displayAccountType();
    }
}
