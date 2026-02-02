import java.io.*;
import java.util.*;

class StudentDataStream {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"));

            System.out.print("Number of students: ");
            int n = sc.nextInt();
            dos.writeInt(n);

            for (int i = 0; i < n; i++) {
                int roll = sc.nextInt();
                String name = sc.next();
                double gpa = sc.nextDouble();

                dos.writeInt(roll);
                dos.writeUTF(name);
                dos.writeDouble(gpa);
            }

            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("students.dat"));

            int count = dis.readInt();

            System.out.println("Stored Students:");
            for (int i = 0; i < count; i++) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println(roll + " " + name + " " + gpa);
            }

            dis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
