import java.util.Scanner;
class Distance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextInt();
        double yard = feet/3;
        double mile = yard/1760;
        System.out.println("Your distance in feet is "+feet+" while in yards is "+yard+" and in miles is "+mile);
    }
}