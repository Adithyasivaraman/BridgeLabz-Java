import java.util.*;

class InvertMap {

    static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> result = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            result.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map.put(key, value);
        }

        Map<Integer, List<String>> inverted = invert(map);
        System.out.println(inverted);
    }
}
