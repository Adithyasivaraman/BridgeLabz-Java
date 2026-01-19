import java.util.Scanner;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int q) {
        quantity += q;
    }

    void removeItem(int q) {
        if (q <= quantity) quantity -= q;
    }

    double totalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem c = new CartItem();
        c.itemName = sc.nextLine();
        c.price = sc.nextDouble();
        c.addItem(sc.nextInt());
        c.removeItem(sc.nextInt());
        System.out.println(c.totalCost());
    }
}
