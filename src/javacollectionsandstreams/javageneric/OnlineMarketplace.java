import java.util.*;

abstract class Category {
    private String name;

    Category(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class BookCategory extends Category {
    BookCategory() {
        super("Books");
    }
}

class ClothingCategory extends Category {
    ClothingCategory() {
        super("Clothing");
    }
}

class GadgetCategory extends Category {
    GadgetCategory() {
        super("Gadgets");
    }
}

class Product<T extends Category> {
    private String productName;
    private double price;
    private T category;

    Product(String productName, double price, T category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String getProductName() {
        return productName;
    }

    T getCategory() {
        return category;
    }
}

public class OnlineMarketplace {

    static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setPrice(discountedPrice);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 20000, new GadgetCategory());

        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
        applyDiscount(phone, 5);

        System.out.println(book.getProductName() + " - " + book.getPrice() + " - " + book.getCategory().getName());
        System.out.println(shirt.getProductName() + " - " + shirt.getPrice() + " - " + shirt.getCategory().getName());
        System.out.println(phone.getProductName() + " - " + phone.getPrice() + " - " + phone.getCategory().getName());
    }
}
