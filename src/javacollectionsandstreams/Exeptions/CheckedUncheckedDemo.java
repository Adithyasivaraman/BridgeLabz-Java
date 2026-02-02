import java.io.*;

class CheckedUncheckedDemo {

    static void processData(String fileName, int divisor) throws IOException {

        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        System.out.println("File opened successfully.");
        br.close();
    }

    public static void main(String[] args) {

        try {
            processData("data.txt", 0);
        } catch (ArithmeticException e) {
            System.out.println("Runtime error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File error occurred.");
        }
    }
}
