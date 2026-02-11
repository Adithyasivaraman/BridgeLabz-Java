import java.io.*;

public class UpdateSalary {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("updated.csv"));

        bw.write(br.readLine() + "\n");

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d[2].equals("IT")) {
                double salary = Double.parseDouble(d[3]) * 1.10;
                d[3] = String.valueOf((int)salary);
            }
            bw.write(String.join(",", d) + "\n");
        }

        br.close();
        bw.close();
    }
}
