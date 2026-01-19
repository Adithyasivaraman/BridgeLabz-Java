import java.util.Scanner;
class HeightConv{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightCm = sc.nextDouble();
        double heightInch = heightCm/2.54;
        double heightFeet = heightInch/12;
        System.out.println("Your height in cm is "+heightCm+" while in feet is "+heightFeet+" and inches is "+heightInch);
    }
}