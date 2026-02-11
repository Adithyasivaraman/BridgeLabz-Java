import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) throws Exception {
        Pattern email = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");

            if (!email.matcher(d[2]).matches() ||
                    !d[3].matches("\\d{10}"))
                System.out.println("Invalid row: " + line);
        }
        br.close();
    }
}
