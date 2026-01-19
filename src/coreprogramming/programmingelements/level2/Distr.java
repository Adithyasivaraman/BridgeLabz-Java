import java.util.Scanner;
public class Distr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();
        int eachGets = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;
        System.out.println("The number of chocolates each child gets is " + eachGets + " and the number of remaining chocolates are " + remaining);
    }
}
