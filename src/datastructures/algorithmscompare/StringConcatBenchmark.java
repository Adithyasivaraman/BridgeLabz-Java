import java.util.*;

class StringConcatBenchmark {

    static long testString(int n) {
        String s = "";
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            s = s + "a";
        }
        long end = System.nanoTime();
        return end - start;
    }

    static long testStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long end = System.nanoTime();
        return end - start;
    }

    static long testStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long t1 = testString(n);
        long t2 = testStringBuilder(n);
        long t3 = testStringBuffer(n);

        System.out.println("String Time: " + t1 + " ns");
        System.out.println("StringBuilder Time: " + t2 + " ns");
        System.out.println("StringBuffer Time: " + t3 + " ns");
    }
}
