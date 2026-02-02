import java.io.*;

class ConsoleToFile {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Name: ");
            String name = reader.readLine();

            System.out.print("Age: ");
            String age = reader.readLine();

            System.out.print("Favorite Language: ");
            String lang = reader.readLine();

            BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt"));

            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Age: " + age);
            writer.newLine();
            writer.write("Language: " + lang);

            writer.close();

            System.out.println("Data saved to user.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
