java import java.util.Scanner;
class Handshake{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int shake = (students*(students-1))/2;
        System.out.println(shake);
    }
}