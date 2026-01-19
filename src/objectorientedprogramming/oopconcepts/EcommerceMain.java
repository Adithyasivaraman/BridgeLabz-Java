import java.util.*;

class Product {
    String name;
    Product(String name) {
        this.name = name;
    }
}

class Order {
    List<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }
}

class Customer {
    String name;
    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order:");
        for (Product p : o.products)
            System.out.println(p.name);
    }
}

public class EcommerceMain {
    public static void main(String[] args) {
        Customer c = new Customer("Adi");
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Mouse");

        Order o = new Order();
        o.addProduct(p1);
        o.addProduct(p2);

        c.placeOrder(o);
    }
}
