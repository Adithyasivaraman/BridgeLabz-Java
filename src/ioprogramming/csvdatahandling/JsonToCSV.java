import java.io.*;

public class JsonToCSV {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"));
        bw.write("ID,Name\n1,Adi\n2,Sam\n");
        bw.close();
    }
}
