import java.util.*;

public class OptionalMax {
    public static void main(String[] args) {
        List<Integer> list =
                Arrays.asList(5,9,2,11);

        Optional<Integer> max =
                list.stream().max(Integer::compare);

        System.out.println(max.orElse(-1));
    }
}
