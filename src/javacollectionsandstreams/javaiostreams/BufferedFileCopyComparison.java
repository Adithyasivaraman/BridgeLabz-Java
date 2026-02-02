import java.io.*;

class BufferedFileCopyComparison {

    static void copyNormal(String src, String dest) throws Exception {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] buffer = new byte[4096];
        int bytesRead;

        long start = System.nanoTime();

        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        long end = System.nanoTime();

        fis.close();
        fos.close();

        System.out.println("Normal Copy Time: " + (end - start));
    }

    static void copyBuffered(String src, String dest) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        byte[] buffer = new byte[4096];
        int bytesRead;

        long start = System.nanoTime();

        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        long end = System.nanoTime();

        bis.close();
        bos.close();

        System.out.println("Buffered Copy Time: " + (end - start));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Source file: ");
        String src = br.readLine();

        copyNormal(src, "normal_copy.dat");
        copyBuffered(src, "buffered_copy.dat");
    }
}
