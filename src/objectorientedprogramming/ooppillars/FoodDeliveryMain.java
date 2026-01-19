import java.util.*;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " x " + quantity + " Total: " + calculateTotalPrice());
    }
}

class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    @Override
    public String getDiscountDetails() {
        return "10% Veg Discount";
    }
}

class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "5% Non-Veg Discount";
    }
}

public class FoodDeliveryMain {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer", 200, 2));
        order.add(new NonVegItem("Chicken", 300, 1));

        for (FoodItem f : order) {
            f.getItemDetails();
        }
    }
}
