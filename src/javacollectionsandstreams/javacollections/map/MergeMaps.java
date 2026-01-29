import java.util.*;

class MergeMaps {

    static Map<String, Integer> merge(Map<String, Integer> m1, Map<String, Integer> m2) {
        Map<String, Integer> result = new HashMap<>(m1);

        for (Map.Entry<String, Integer> entry : m2.entrySet()) {
            result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map1.put(key, value);
        }

        int n2 = sc.nextInt();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n2; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map2.put(key, value);
        }

        Map<String, Integer> merged = merge(map1, map2);
        System.out.println(merged);
    }
}
