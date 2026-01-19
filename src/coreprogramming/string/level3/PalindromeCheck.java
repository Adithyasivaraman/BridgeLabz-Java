import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeLoop(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursion(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRecursion(s, start + 1, end - 1);
    }

    public static boolean isPalindromeArray(String s) {
        char[] original = s.toCharArray();
        char[] reverse = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reverse[i] = s.charAt(original.length - 1 - i);
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(isPalindromeLoop(text));
        System.out.println(isPalindromeRecursion(text, 0, text.length() - 1));
        System.out.println(isPalindromeArray(text));
    }
}