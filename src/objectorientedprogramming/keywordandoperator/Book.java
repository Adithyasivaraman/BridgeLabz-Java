class Book {
    static String libraryName = "Central Library";

    final String isbn;
    String title, author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void show(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println(b.title + " by " + b.author + " [" + b.isbn + "]");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Mastery", "Adi", "ISBN001");
        b1.show(b1);
        displayLibraryName();
    }
}
