import java.io.*;
import java.util.*;

class TopWordsInFile {

    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("File path: ");
            String file = console.readLine();

            BufferedReader reader = new BufferedReader(new FileReader(file));
            Map<String, Integer> freq = new HashMap<>();

            String line;

            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
                String[] words = line.split("\\s+");

                for (String w : words) {
                    if (w.length() > 0)
                        freq.put(w, freq.getOrDefault(w, 0) + 1);
                }
            }

            reader.close();

            List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
            list.sort((a, b) -> b.getValue() - a.getValue());

            System.out.println("Top 5 Words:");
            for (int i = 0; i < Math.min(5, list.size()); i++) {
                System.out.println(list.get(i).getKey() + " -> " + list.get(i).getValue());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
