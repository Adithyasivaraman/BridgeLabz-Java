import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

class FileReadBenchmark {

    static long readWithFileReader(String file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        long words = 0;
        String line;
        while ((line = br.readLine()) != null) {
            words += line.split("\\s+").length;
        }
        br.close();
        return words;
    }

    static long readWithInputStreamReader(String file) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)
        );
        long words = 0;
        String line;
        while ((line = br.readLine()) != null) {
            words += line.split("\\s+").length;
        }
        br.close();
        return words;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();

        long startFR = System.nanoTime();
        long wordsFR = readWithFileReader(file);
        long endFR = System.nanoTime();

        long startISR = System.nanoTime();
        long wordsISR = readWithInputStreamReader(file);
        long endISR = System.nanoTime();

        System.out.println("FileReader Words: " + wordsFR);
        System.out.println("FileReader Time: " + (endFR - startFR) + " ns");

        System.out.println("InputStreamReader Words: " + wordsISR);
        System.out.println("InputStreamReader Time: " + (endISR - startISR) + " ns");
    }
}
