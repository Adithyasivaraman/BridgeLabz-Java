import java.util.*;

class SetEquality {

    static <T> boolean areEqual(Set<T> s1, Set<T> s2) {
        if (s1.size() != s2.size()) return false;
        return s1.containsAll(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n1; i++) set1.add(sc.nextInt());

        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n2; i++) set2.add(sc.nextInt());

        System.out.println(areEqual(set1, set2));
    }
}
import java.util.*;

class SetUnionIntersection {

    static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    static <T> Set<T> intersection(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1);
        result.retainAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n1; i++) set1.add(sc.nextInt());

        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n2; i++) set2.add(sc.nextInt());

        Set<Integer> unionSet = union(set1, set2);
        Set<Integer> intersectionSet = intersection(set1, set2);

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}
