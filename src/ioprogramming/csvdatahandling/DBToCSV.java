import java.io.*;

public class DBToCSV {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("db_export.csv"));

        bw.write("ID,Name,Department,Salary\n");
        bw.write("1,Adi,IT,60000\n"); // simulate DB rows
        bw.write("2,Sam,HR,50000\n");

        bw.close();
    }
}
