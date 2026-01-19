class ItemNode {
    int itemId;
    String name;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryLinkedList {
    private ItemNode head;

    // Add at end
    public void addItem(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Remove by Item ID
    public void removeItem(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode prev = head;
        ItemNode curr = head.next;

        while (curr != null && curr.itemId != id) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;
    }

    // Update quantity
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by ID or Name
    public void searchItem(String key) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(key) ||
                    String.valueOf(temp.itemId).equals(key)) {
                System.out.println("Found: " + temp.name + " Qty: " + temp.quantity);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Total Inventory Value
    public double totalValue() {
        double sum = 0;
        ItemNode temp = head;
        while (temp != null) {
            sum += temp.price * temp.quantity;
            temp = temp.next;
        }
        return sum;
    }

    // Display
    public void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(temp.itemId + " " + temp.name +
                    " Qty:" + temp.quantity +
                    " Price:" + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryLLMain {
    public static void main(String[] args) {
        InventoryLinkedList inv = new InventoryLinkedList();

        inv.addItem(101, "Laptop", 5, 60000);
        inv.addItem(102, "Mouse", 20, 500);
        inv.addItem(103, "Keyboard", 10, 1500);

        inv.display();
        System.out.println("Total Inventory Value: " + inv.totalValue());

        inv.updateQuantity(102, 30);
        inv.searchItem("Mouse");

        inv.removeItem(101);
        inv.display();
    }
}
