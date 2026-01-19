import java.util.Scanner;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class SavingsAccount extends BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount s = new SavingsAccount();
        s.accountNumber = sc.nextInt();
        sc.nextLine();
        s.accountHolder = sc.nextLine();
        s.setBalance(sc.nextDouble());

        System.out.println(s.accountNumber);
        System.out.println(s.accountHolder);
        System.out.println(s.getBalance());
    }
}
