import java.util.Scanner;

public class MaximumOfThree {

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findMax(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
}
