import java.util.*;

class SubsetCheck {

    static <T> boolean isSubset(Set<T> small, Set<T> large) {
        return large.containsAll(small);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n1; i++) set1.add(sc.nextInt());

        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n2; i++) set2.add(sc.nextInt());

        System.out.println(isSubset(set1, set2));
    }
}
