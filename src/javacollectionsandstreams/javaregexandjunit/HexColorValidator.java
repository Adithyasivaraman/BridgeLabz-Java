import java.util.Scanner;

class HexColorValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();

        String regex = "^#[0-9A-Fa-f]{6}$";

        if (color.matches(regex))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
