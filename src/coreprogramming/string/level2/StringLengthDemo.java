import java.util.Scanner;

public class StringLengthDemo {

    public static int lengthUsingCharAt(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int userLength = lengthUsingCharAt(text);
        int builtInLength = text.length();

        System.out.println(userLength);
        System.out.println(builtInLength);

        sc.close();
    }
}
