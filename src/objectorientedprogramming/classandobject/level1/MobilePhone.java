import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    double price;

    void display() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone m = new MobilePhone();
        m.brand = sc.nextLine();
        m.model = sc.nextLine();
        m.price = sc.nextDouble();
        m.display();
    }
}
