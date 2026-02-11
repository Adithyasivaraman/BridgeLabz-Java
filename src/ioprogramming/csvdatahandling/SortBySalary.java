import java.io.*;
import java.util.*;

public class SortBySalary {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        br.readLine();

        List<String[]> list = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null)
            list.add(line.split(","));

        list.sort((a,b) ->
                Integer.compare(
                        Integer.parseInt(b[3]),
                        Integer.parseInt(a[3])));

        for (int i = 0; i < Math.min(5,list.size()); i++)
            System.out.println(Arrays.toString(list.get(i)));

        br.close();
    }
}
