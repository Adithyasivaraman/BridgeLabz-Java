import java.util.*;
import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {
        List<String> list =
            Arrays.asList("Notebook","Android","Elephant","Pen");

        Predicate<String> len = s -> s.length() > 5;
        Predicate<String> contains = s -> s.contains("and");

        list.stream()
            .filter(len.and(contains))
            .forEach(System.out::println);
    }
}
