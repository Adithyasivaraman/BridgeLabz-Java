import java.io.*;

public class CountRowsCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine();

        int count = 0;
        while (br.readLine() != null) count++;

        System.out.println("Total records: " + count);
        br.close();
    }
}
