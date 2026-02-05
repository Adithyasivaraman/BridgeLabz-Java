import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("java","lambda","streams");

        Consumer<String> printer =
                s -> System.out.println(s.toUpperCase());

        list.forEach(printer);
    }
}
