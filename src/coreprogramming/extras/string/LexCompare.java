import java.util.Scanner;

public class LexCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int i = 0;
        while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)) i++;
        if (i == a.length() && i == b.length()) System.out.println("Equal");
        else if (i == a.length() || (i < b.length() && a.charAt(i) < b.charAt(i)))
            System.out.println(a + " comes before " + b);
        else System.out.println(b + " comes before " + a);
    }
}