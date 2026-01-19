class BookNode {
    String title, author, genre;
    int bookId;
    boolean available;
    BookNode prev, next;

    BookNode(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.prev = this.next = null;
    }
}

class LibraryDoublyLinkedList {
    private BookNode head, tail;

    // Add at end
    public void addBook(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove by Book ID
    public void removeBook(int id) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by Title or Author
    public void search(String key) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(key) || temp.author.equalsIgnoreCase(key)) {
                System.out.println(temp.bookId + " " + temp.title + " by " + temp.author);
            }
            temp = temp.next;
        }
    }

    // Update Availability
    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                return;
            }
            temp = temp.next;
        }
    }

    // Display forward
    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author +
                    " " + temp.genre + " Available: " + temp.available);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author +
                    " " + temp.genre + " Available: " + temp.available);
            temp = temp.prev;
        }
    }

    // Count total books
    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class LibraryDLLMain {
    public static void main(String[] args) {
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addBook(1, "Java", "Adi", "Programming", true);
        library.addBook(2, "DSA", "CLRS", "Computer Science", true);
        library.addBook(3, "AI", "OpenAI", "Technology", false);

        library.displayForward();
        System.out.println("Reverse:");
        library.displayReverse();

        library.search("Adi");
        library.updateAvailability(3, true);

        System.out.println("Total Books: " + library.countBooks());
        library.removeBook(2);
        library.displayForward();
    }
}
