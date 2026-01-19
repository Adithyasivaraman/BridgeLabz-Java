import java.util.Scanner;
public class FactorsWithOperations {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[idx++] = i;
        }
        return factors;
    }
    public static int sum(int[] factors) {
        int s = 0;
        for (int f : factors) s += f;
        return s;
    }
    public static long product(int[] factors) {
        long p = 1;
        for (int f : factors) p *= f;
        return p;
    }
    public static double sumOfSquares(int[] factors) {
        double s = 0;
        for (int f : factors) s += Math.pow(f, 2);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        for (int f : factors) System.out.println(f);
        System.out.println("Sum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));
    }
}
