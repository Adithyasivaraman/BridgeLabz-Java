import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char r = sc.next().charAt(0);
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != r) res += s.charAt(i);
        }
        System.out.println(res);
    }
}
