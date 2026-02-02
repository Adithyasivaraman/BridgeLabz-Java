import java.util.Stack;

class StockSpan {
    public static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        st.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }

            span[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
        return span;
    }
}

public class StockSpans {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = StockSpan.calculateSpan(prices);

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
