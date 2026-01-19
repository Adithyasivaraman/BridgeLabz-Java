import java.util.Scanner;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double totalCost(double rate) {
        return rentalDays * rate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarRental c = new CarRental(sc.nextLine(), sc.nextLine(), sc.nextInt());
        double rate = sc.nextDouble();
        System.out.println(c.totalCost(rate));
    }
}