import java.util.Scanner;

public class SplitTextCompare {

    public static int lengthWithoutLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    public static String[] splitUsingCharAt(String text) {
        int len = lengthWithoutLength(text);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndex = new int[wordCount + 1];
        spaceIndex[0] = -1;
        int idx = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = len;

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static boolean compareStringArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            int j = 0;
            try {
                while (true) {
                    if (a1[i].charAt(j) != a2[i].charAt(j)) {
                        return false;
                    }
                    j++;
                }
            } catch (RuntimeException e) {
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] userSplit = splitUsingCharAt(text);
        String[] builtInSplit = text.split(" ");

        boolean result = compareStringArrays(userSplit, builtInSplit);

        System.out.println(result);

        sc.close();
    }
}
