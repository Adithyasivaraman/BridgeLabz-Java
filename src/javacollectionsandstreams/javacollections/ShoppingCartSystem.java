import java.util.*;

class ShoppingCartSystem {

    static HashMap<String, Double> priceMap = new HashMap<>();
    static LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();

    static void addProduct(String name, double price) {
        priceMap.put(name, price);
    }

    static void addToCart(String name, int quantity) {
        if (!priceMap.containsKey(name)) {
            System.out.println("Product not found");
            return;
        }
        cart.put(name, cart.getOrDefault(name, 0) + quantity);
    }

    static void showCartInsertionOrder() {
        double total = 0;
        for (Map.Entry<String, Integer> e : cart.entrySet()) {
            double price = priceMap.get(e.getKey());
            double cost = price * e.getValue();
            total += cost;
            System.out.println(e.getKey() + " x " + e.getValue() + " = " + cost);
        }
        System.out.println("Total: " + total);
    }

    static void showCartSortedByPrice() {
        TreeMap<Double, List<String>> sorted = new TreeMap<>();
        for (String product : cart.keySet()) {
            double price = priceMap.get(product);
            sorted.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
        }

        for (Map.Entry<Double, List<String>> e : sorted.entrySet()) {
            for (String product : e.getValue()) {
                System.out.println(product + " -> " + e.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Product");
            System.out.println("2.Add to Cart");
            System.out.println("3.Show Cart (Insertion Order)");
            System.out.println("4.Show Products Sorted by Price");
            System.out.println("0.Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Product Name: ");
                    String pname = sc.next();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    addProduct(pname, price);
                    System.out.println("Product Added");
                    break;

                case 2:
                    System.out.print("Product Name: ");
                    String item = sc.next();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    addToCart(item, qty);
                    break;

                case 3:
                    showCartInsertionOrder();
                    break;

                case 4:
                    showCartSortedByPrice();
                    break;

                case 0:
                    return;
            }
        }
    }
}
