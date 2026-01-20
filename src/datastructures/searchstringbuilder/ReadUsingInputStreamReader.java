import java.io.*;
import java.nio.charset.StandardCharsets;

class ReadUsingInputStreamReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("input.txt"), StandardCharsets.UTF_8)
        );
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
