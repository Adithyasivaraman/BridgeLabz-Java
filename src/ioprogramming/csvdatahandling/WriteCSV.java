import java.io.*;

public class WriteCSV {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"));

        bw.write("ID,Name,Department,Salary\n");
        bw.write("1,Adi,IT,60000\n");
        bw.write("2,Sam,HR,50000\n");
        bw.write("3,Riya,Sales,55000\n");
        bw.write("4,John,IT,70000\n");
        bw.write("5,Ana,Finance,65000\n");

        bw.close();
    }
}
