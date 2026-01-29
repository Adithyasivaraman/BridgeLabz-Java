import java.util.*;

class BankingSystem {

    static HashMap<String, Double> accounts = new HashMap<>();
    static Queue<String> withdrawalQueue = new LinkedList<>();

    static void addAccount(String accNo, double balance) {
        accounts.put(accNo, balance);
    }

    static void deposit(String accNo, double amount) {
        accounts.put(accNo, accounts.get(accNo) + amount);
    }

    static void requestWithdrawal(String accNo, double amount) {
        withdrawalQueue.add(accNo + ":" + amount);
    }

    static void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String req = withdrawalQueue.poll();
            String[] parts = req.split(":");
            String accNo = parts[0];
            double amount = Double.parseDouble(parts[1]);

            if (accounts.get(accNo) >= amount) {
                accounts.put(accNo, accounts.get(accNo) - amount);
                System.out.println("Withdrawal successful for " + accNo + " Amount: " + amount);
            } else {
                System.out.println("Insufficient balance for " + accNo);
            }
        }
    }

    static void showAccountsSortedByBalance() {
        TreeMap<Double, List<String>> sorted = new TreeMap<>();

        for (Map.Entry<String, Double> e : accounts.entrySet()) {
            sorted.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }

        for (Map.Entry<Double, List<String>> e : sorted.entrySet()) {
            for (String acc : e.getValue()) {
                System.out.println(acc + " -> " + e.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Request Withdrawal");
            System.out.println("4.Process Withdrawals");
            System.out.println("5.Show Accounts Sorted by Balance");
            System.out.println("0.Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Account Number: ");
                    String acc = sc.next();
                    System.out.print("Initial Balance: ");
                    double bal = sc.nextDouble();
                    addAccount(acc, bal);
                    System.out.println("Account Created");
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    String accD = sc.next();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    deposit(accD, amt);
                    break;

                case 3:
                    System.out.print("Account Number: ");
                    String accW = sc.next();
                    System.out.print("Amount: ");
                    double wamt = sc.nextDouble();
                    requestWithdrawal(accW, wamt);
                    System.out.println("Withdrawal Request Queued");
                    break;

                case 4:
                    processWithdrawals();
                    break;

                case 5:
                    showAccountsSortedByBalance();
                    break;

                case 0:
                    return;
            }
        }
    }
}
