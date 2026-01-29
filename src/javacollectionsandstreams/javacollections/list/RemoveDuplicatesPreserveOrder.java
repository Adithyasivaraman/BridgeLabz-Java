import java.util.*;

class RemoveDuplicatesPreserveOrder {

    static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>();
        for (int x : list) {
            seen.add(x);
        }
        return new ArrayList<>(seen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> result = removeDuplicates(list);
        System.out.println(result);
    }
}
