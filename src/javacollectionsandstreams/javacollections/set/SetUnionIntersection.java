import java.util.*;

class SymmetricDifference {

    static <T> Set<T> symmetricDifference(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1);
        Set<T> temp = new HashSet<>(s2);

        result.removeAll(s2);
        temp.removeAll(s1);

        result.addAll(temp);
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

        Set<Integer> result = symmetricDifference(set1, set2);
        System.out.println(result);
    }
}
