class TransactionException extends Exception {
    TransactionException(String msg) {
        super(msg);
    }
}

class TransactionProcessor {

    static void processTransaction(double amount)
            throws TransactionException {

        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Negative transaction");
            }

            System.out.println("Transaction processed: " + amount);

        } catch (IllegalArgumentException e) {
            throw new TransactionException(
                    "Transaction failed for amount: " + amount
            );
        }
    }

    public static void main(String[] args) {
        try {
            processTransaction(-500);
        } catch (TransactionException e) {
            System.out.println(e.getMessage());
        }
    }
}
