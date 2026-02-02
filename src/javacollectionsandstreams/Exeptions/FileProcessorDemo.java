import java.io.*;
import java.util.*;

class FileProcessor {

    void processFiles(List<String> filePaths) {
        for (String path : filePaths) {
            System.out.println("Reading: " + path);

            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + path);
            }
        }
    }
}

class FileProcessorDemo {

    public static void main(String[] args) {
        List<String> files = Arrays.asList("file1.txt", "file2.txt");
        new FileProcessor().processFiles(files);
    }
}
