import java.util.Scanner;

public class BookDetails {
    String title;
    String author;
    double price;

    void display() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDetails b = new BookDetails();
        b.title = sc.nextLine();
        b.author = sc.nextLine();
        b.price = sc.nextDouble();
        b.display();
    }
}
