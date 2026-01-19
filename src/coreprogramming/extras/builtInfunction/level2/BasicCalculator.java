import java.util.Scanner;

public class BasicCalculator {

    static double add(double a, double b) { return Math.addExact((int)a, (int)b); }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        if (op == '+') System.out.println(add(a, b));
        else if (op == '-') System.out.println(subtract(a, b));
        else if (op == '*') System.out.println(multiply(a, b));
        else if (op == '/') System.out.println(divide(a, b));
    }
}
