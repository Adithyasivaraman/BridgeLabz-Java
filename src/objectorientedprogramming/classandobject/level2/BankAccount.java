import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    void displayBalance() {
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        b.accountHolder = sc.nextLine();
        b.accountNumber = sc.nextInt();
        b.balance = sc.nextDouble();
        b.deposit(sc.nextDouble());
        b.withdraw(sc.nextDouble());
        b.displayBalance();
    }
}
