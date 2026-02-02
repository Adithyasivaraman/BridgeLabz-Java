import java.io.*;

class ImageByteArrayCopy {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Source image: ");
            String src = br.readLine();

            System.out.print("Destination image: ");
            String dest = br.readLine();

            FileInputStream fis = new FileInputStream(src);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            fis.close();

            byte[] imageData = baos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
            FileOutputStream fos = new FileOutputStream(dest);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fos.close();
            bais.close();

            System.out.println("Image copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}