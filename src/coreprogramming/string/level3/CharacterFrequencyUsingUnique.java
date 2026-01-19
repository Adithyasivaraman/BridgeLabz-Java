import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[index++] = ch;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] unique = uniqueCharacters(text);

        for (char c : unique) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == c) count++;
            }
            System.out.println(c + " : " + count);
        }
    }
}