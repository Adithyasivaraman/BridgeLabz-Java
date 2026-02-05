import java.util.*;
import java.util.stream.*;

class Sale {
    String productId;
    int quantity;
    double price;

    Sale(String p, int q, double pr) {
        productId = p;
        quantity = q;
        price = pr;
    }
}

class ProductSales {
    String productId;
    double revenue;

    ProductSales(String p, double r) {
        productId = p;
        revenue = r;
    }
}

public class ProductSalesAnalysis {
    public static void main(String[] args) {

        List<Sale> sales = Arrays.asList(
                new Sale("P1",15,100),
                new Sale("P2",8,200),
                new Sale("P3",20,50),
                new Sale("P4",25,40),
                new Sale("P5",30,60),
                new Sale("P6",50,30)
        );

        List<ProductSales> result =
                sales.stream()
                        .filter(s -> s.quantity > 10)
                        .map(s -> new ProductSales(
                                s.productId,
                                s.quantity * s.price))
                        .sorted((a,b)->Double.compare(b.revenue,a.revenue))
                        .limit(5)
                        .collect(Collectors.toList());

        result.forEach(p ->
                System.out.println(p.productId+" "+p.revenue));
    }
}
