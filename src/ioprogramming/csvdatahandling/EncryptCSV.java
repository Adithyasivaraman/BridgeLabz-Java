import java.io.*;
import java.util.Base64;

public class EncryptCSV {
    public static void main(String[] args) throws Exception {

        String salary = "60000";
        String encrypted =
                Base64.getEncoder().encodeToString(salary.getBytes());

        System.out.println("Encrypted: " + encrypted);

        String decrypted =
                new String(Base64.getDecoder().decode(encrypted));

        System.out.println("Decrypted: " + decrypted);
    }
}
