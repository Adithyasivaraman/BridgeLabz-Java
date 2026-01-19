import java.util.Scanner;
public class SumNaturalRecursive {
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) return;
        int r1 = sumRecursive(n);
        int r2 = sumFormula(n);
        System.out.println("Recursive = " + r1);
        System.out.println("Formula = " + r2);
        System.out.println(r1 == r2);
    }
}
