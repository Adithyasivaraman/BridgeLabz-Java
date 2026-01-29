import java.io.*;
import java.util.*;

class WordFrequencyCounter {

    static Map<String, Integer> countWords(String fileName) throws Exception {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
            String[] words = line.split("\\s+");
            for (String w : words) {
                if (w.length() > 0) {
                    map.put(w, map.getOrDefault(w, 0) + 1);
                }
            }
        }

        br.close();
        return map;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        Map<String, Integer> result = countWords(fileName);
        System.out.println(result);
    }
}
