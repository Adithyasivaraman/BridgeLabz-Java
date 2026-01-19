import java.util.Scanner;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

public class EBook extends Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EBook e = new EBook();
        e.ISBN = sc.nextLine();
        e.title = sc.nextLine();
        e.setAuthor(sc.nextLine());

        System.out.println(e.ISBN);
        System.out.println(e.title);
        System.out.println(e.getAuthor());
    }
}
