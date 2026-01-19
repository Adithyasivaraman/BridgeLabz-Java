class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {
        System.out.println(name + " Balance: " + balance);
    }
}

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c, double amount) {
        c.balance = amount;
        System.out.println(c.name + " opened account in " + bankName);
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Adi");

        bank.openAccount(c1, 5000);
        c1.viewBalance();
    }
}
