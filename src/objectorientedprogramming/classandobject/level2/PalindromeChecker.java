import java.util.Scanner;

public class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String rev = new StringBuilder(text).reverse().toString();
        return text.equals(rev);
    }

    void displayResult() {
        System.out.println(isPalindrome());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker p = new PalindromeChecker();
        p.text = sc.nextLine();
        p.displayResult();
    }
}
