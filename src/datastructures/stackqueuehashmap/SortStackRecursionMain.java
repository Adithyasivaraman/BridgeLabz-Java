import java.util.Stack;

class StackSorter {

    public static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sort(stack);
            insertInSortedOrder(stack, top);
        }
    }

    private static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }
        int temp = stack.pop();
        insertInSortedOrder(stack, value);
        stack.push(temp);
    }
}

public class SortStackRecursionMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        System.out.println("Original Stack: " + stack);
        StackSorter.sort(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
