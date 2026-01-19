import java.util.Scanner;

public class Product {
    String productName;
    double price;
    static int totalProducts;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println(productName);
        System.out.println(price);
    }

    static void displayTotalProducts() {
        System.out.println(totalProducts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product(sc.nextLine(), sc.nextDouble());
        Product p2 = new Product(sc.nextLine(), sc.nextDouble());
        p1.displayProductDetails();
        p2.displayProductDetails();
        displayTotalProducts();
    }
}
