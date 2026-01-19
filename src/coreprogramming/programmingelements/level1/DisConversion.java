import java.util.Scanner;
class DisConversion{
    public static void main(String[] args) {
        double Km = 0;
        Scanner sc = new Scanner(System.in);
        Km = sc.nextDouble();
        System.out.println("The total miles is "+Km/1.6+" mile for the given "+Km+" km");
    }
}