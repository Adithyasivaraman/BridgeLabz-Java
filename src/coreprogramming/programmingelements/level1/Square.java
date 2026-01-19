import java.util.Scanner;
class Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peri = sc.nextInt();
        System.out.println("The length of the side is "+peri/4+" whose perimeter is "+peri);
    }
}