import java.util.*;

class CircularBuffer {

    private int[] buffer;
    private int head = 0;
    private int size = 0;

    CircularBuffer(int capacity) {
        buffer = new int[capacity];
    }

    void add(int x) {
        buffer[(head + size) % buffer.length] = x;
        if (size < buffer.length) {
            size++;
        } else {
            head = (head + 1) % buffer.length;
        }
    }

    List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(buffer[(head + i) % buffer.length]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        CircularBuffer cb = new CircularBuffer(capacity);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            cb.add(sc.nextInt());
        }

        System.out.println(cb.getBuffer());
    }
}
