import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "NA";
        author = "NA";
        price = 0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();
        Book b2 = new Book(sc.nextLine(), sc.nextLine(), sc.nextDouble());
        b1.display();
        b2.display();
    }
}
