import java.io.*;

class LowercaseFileCopy {

    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Source file: ");
            String src = console.readLine();

            System.out.print("Destination file: ");
            String dest = console.readLine();

            BufferedReader reader = new BufferedReader(new FileReader(src));
            BufferedWriter writer = new BufferedWriter(new FileWriter(dest));

            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Converted file saved.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
