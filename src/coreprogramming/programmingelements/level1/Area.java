import java.sql.SQLOutput;
import java.util.Scanner;
class Area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightCm = sc.nextInt();
        double baseCm = sc.nextInt();
        double heightFeet = heightCm/12;
        double baseFeet = baseCm/12;
        double heightInch = heightFeet/2.54;
        double baseInch = baseFeet/2.54;
        System.out.println("Your height in cm is "+0.5*baseCm*heightCm+" while in feet is "+0.5*baseFeet*heightFeet+" and inches is "+0.5*baseInch*heightInch);
    }
}