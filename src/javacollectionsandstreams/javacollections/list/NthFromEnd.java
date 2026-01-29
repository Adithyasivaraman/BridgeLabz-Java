import java.util.*;

class NthFromEnd {

    static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) return null;
            fast.next();
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            list.add(sc.next());
        }

        int n = sc.nextInt();

        String result = findNthFromEnd(list, n);
        System.out.println(result);
    }
}
