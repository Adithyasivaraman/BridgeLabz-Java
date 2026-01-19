import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char ans = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] > freq[ans]) ans = s.charAt(i);
        }
        System.out.println(ans);
    }
}