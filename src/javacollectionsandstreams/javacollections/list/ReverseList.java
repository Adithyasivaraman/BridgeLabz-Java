import java.util.*;

class ReverseList {

    static <T> void reverseList(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) arrayList.add(sc.nextInt());

        List<Integer> linkedList = new LinkedList<>(arrayList);

        reverseList(arrayList);
        reverseList(linkedList);

        System.out.println("Reversed ArrayList: " + arrayList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
