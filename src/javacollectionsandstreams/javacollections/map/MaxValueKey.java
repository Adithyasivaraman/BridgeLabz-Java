import java.util.*;

class MaxValueKey {

    static String findMaxKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
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

        System.out.println(findMaxKey(map));
    }
}
