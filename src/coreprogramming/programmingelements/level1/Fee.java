import java.util.Scanner;
class Fee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentFee = sc.nextInt();
        int discount = sc.nextInt();
        double discountAmount = studentFee*(discount/100.0);
        double finalFee = studentFee - discountAmount;
        System.out.println("The dicount amount in INR "+discountAmount+" and the final discounted fee is INR "+finalFee);
    }
}