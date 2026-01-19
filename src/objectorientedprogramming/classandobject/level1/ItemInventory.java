import java.util.Scanner;

public class ItemInventory {
    int itemCode;
    String itemName;
    double price;

    double totalCost(int quantity) {
        return price * quantity;
    }

    void display() {
        System.out.println(itemCode);
        System.out.println(itemName);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemInventory item = new ItemInventory();
        item.itemCode = sc.nextInt();
        sc.nextLine();
        item.itemName = sc.nextLine();
        item.price = sc.nextDouble();
        int quantity = sc.nextInt();
        item.display();
        System.out.println(item.totalCost(quantity));
    }
}
