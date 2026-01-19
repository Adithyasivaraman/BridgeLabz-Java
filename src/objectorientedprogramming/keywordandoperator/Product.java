class Product {
    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void process(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println(p.productName + " ID:" + p.productID + " Discount:" + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 80000, 1, 501);
        p1.process(p1);
        updateDiscount(15);
    }
}
