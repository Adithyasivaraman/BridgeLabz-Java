import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String text) {
        int value = Integer.parseInt(text);
        System.out.println(value);
    }

    public static void handleException(String text) {
        try {
            int value = Integer.parseInt(text);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception generated");
        }

        handleException(text);

        sc.close();
    }
}
