class BankAccount {
    static String bankName = "OP Bank";
    private static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount b = (BankAccount) obj;
            System.out.println(b.accountHolderName + " - " + b.accountNumber + " - " + bankName);
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Adi", 101);
        a1.display(a1);
        getTotalAccounts();
    }
}