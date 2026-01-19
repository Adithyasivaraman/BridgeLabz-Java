class HashNode {
    int key;
    String value;
    HashNode next;

    HashNode(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

class CustomHashMap {
    private int SIZE = 10;
    private HashNode[] table = new HashNode[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, String value) {
        int index = hash(key);
        HashNode newNode = new HashNode(key, value);

        if (table[index] == null) {
            table[index] = newNode;
            return;
        }

        HashNode temp = table[index];
        while (temp.next != null) {
            if (temp.key == key) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public String get(int key) {
        int index = hash(key);
        HashNode temp = table[index];

        while (temp != null) {
            if (temp.key == key)
                return temp.value;
            temp = temp.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        HashNode curr = table[index], prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null)
                    table[index] = curr.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}

public class CustomHashMapMain {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        map.put(1, "Adi");
        map.put(11, "Rahul"); // collision
        map.put(2, "Kiran");

        System.out.println(map.get(1));
        System.out.println(map.get(11));

        map.remove(1);
        System.out.println(map.get(1)); // null
    }
}
