import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.length() != b.length()) {
            System.out.println(false);
            return;
        }
        int[] f = new int[256];
        for (int i = 0; i < a.length(); i++) {
            f[a.charAt(i)]++;
            f[b.charAt(i)]--;
        }
        for (int x : f) {
            if (x != 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
