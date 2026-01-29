import java.util.*;

class ElementFrequency {

    static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : list) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }
        return freqMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        Map<String, Integer> result = findFrequency(list);
        System.out.println(result);
    }
}
