import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

class MegaChallenge {
    static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return n + 1;
    }

    static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target) return m;
            else if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    static long countWordsUsingFileReader(String file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        long count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            count += line.split("\\s+").length;
        }
        br.close();
        return count;
    }

    static long countWordsUsingInputStreamReader(String file) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        long count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            count += line.split("\\s+").length;
        }
        br.close();
        return count;
    }

    public static void main(String[] args) throws Exception {
        int n = 1000000;

        long sbStart = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        long sbEnd = System.nanoTime();

        long sbufStart = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append("hello");
        long sbufEnd = System.nanoTime();

        System.out.println("StringBuilder Time: " + (sbEnd - sbStart));
        System.out.println("StringBuffer Time: " + (sbufEnd - sbufStart));

        String file = "bigfile.txt";

        long frStart = System.nanoTime();
        long wordsFR = countWordsUsingFileReader(file);
        long frEnd = System.nanoTime();

        long isrStart = System.nanoTime();
        long wordsISR = countWordsUsingInputStreamReader(file);
        long isrEnd = System.nanoTime();

        System.out.println("FileReader Words: " + wordsFR);
        System.out.println("FileReader Time: " + (frEnd - frStart));
        System.out.println("InputStreamReader Words: " + wordsISR);
        System.out.println("InputStreamReader Time: " + (isrEnd - isrStart));

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = sc.nextInt();

        int missing = firstMissingPositive(arr.clone());
        System.out.println("First Missing Positive: " + missing);

        Arrays.sort(arr);
        int target = sc.nextInt();
        int index = binarySearch(arr, target);
        System.out.println("Target Index: " + index);
    }
}
