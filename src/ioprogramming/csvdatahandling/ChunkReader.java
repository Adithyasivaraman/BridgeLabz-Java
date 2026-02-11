import java.io.*;

public class ChunkReader {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("large.csv"));
        br.readLine();

        int count = 0, chunk = 100;
        String line;

        while((line=br.readLine())!=null){
            count++;
            if(count % chunk == 0)
                System.out.println("Processed: " + count);
        }

        br.close();
    }
}
