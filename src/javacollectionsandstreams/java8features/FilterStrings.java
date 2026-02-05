import java.util.*;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Avocado","Cherry");

        list.stream()
                .filter(s -> !s.startsWith("A"))
                .forEach(System.out::println);
    }
}
