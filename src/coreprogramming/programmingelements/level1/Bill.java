import java.util.Scanner;
class Bill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextInt();
        double quantity = sc.nextInt();
        System.out.println("The total purchase price is INR "+unitPrice*quantity+" if the quantity is "+quantity+" and the unit price is INR "+unitPrice);
    }
}