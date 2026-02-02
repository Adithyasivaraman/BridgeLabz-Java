import java.io.*;

class FileCopyBasic {

    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Source file: ");
            String source = console.readLine();

            System.out.print("Destination file: ");
            String dest = console.readLine();

            File srcFile = new File(source);

            if (!srcFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(dest);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
