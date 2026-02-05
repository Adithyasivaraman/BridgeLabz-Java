interface SumOperation {
    int apply(int a, int b);
}

public class SumCalculator {
    public static void main(String[] args) {
        SumOperation sum = (a, b) -> a + b;
        System.out.println(sum.apply(10, 20));
    }
}
