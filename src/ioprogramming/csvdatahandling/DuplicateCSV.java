import java.io.*;
import java.util.*;

public class DuplicateCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine();

        Set<String> ids = new HashSet<>();
        String line;

        while((line=br.readLine())!=null){
            String id=line.split(",")[0];
            if(!ids.add(id))
                System.out.println("Duplicate: " + line);
        }

        br.close();
    }
}
