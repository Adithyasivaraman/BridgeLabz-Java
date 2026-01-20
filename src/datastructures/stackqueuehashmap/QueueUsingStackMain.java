import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    // Enqueue
    public void enqueue(int x) {
        s1.push(x);
    }

    // Dequeue
    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

public class QueueUsingStackMain {
    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(40);
        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // 40
    }
}
