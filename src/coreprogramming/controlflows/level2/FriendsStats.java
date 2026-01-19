import java.util.Scanner;
public class FriendsStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();
        int amarHeight = sc.nextInt();
        int akbarHeight = sc.nextInt();
        int anthonyHeight = sc.nextInt();
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        System.out.println("Youngest age is " + youngestAge);
        System.out.println("Tallest height is " + tallestHeight);
    }
}
