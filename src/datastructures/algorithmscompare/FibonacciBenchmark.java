import java.util.*;

class FibonacciBenchmark {

    static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static long fibonacciIterative(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long startRec = System.nanoTime();
        long r1 = fibonacciRecursive(n);
        long endRec = System.nanoTime();

        long startItr = System.nanoTime();
        long r2 = fibonacciIterative(n);
        long endItr = System.nanoTime();

        System.out.println("Recursive Result: " + r1);
        System.out.println("Recursive Time: " + (endRec - startRec) + " ns");

        System.out.println("Iterative Result: " + r2);
        System.out.println("Iterative Time: " + (endItr - startItr) + " ns");
    }
}
