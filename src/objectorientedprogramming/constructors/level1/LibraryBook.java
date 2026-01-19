import java.util.Scanner;

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available = true;

    void borrowBook() {
        if (available) available = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryBook b = new LibraryBook();
        b.title = sc.nextLine();
        b.author = sc.nextLine();
        b.price = sc.nextDouble();
        b.borrowBook();
        System.out.println(b.available);
    }
}
