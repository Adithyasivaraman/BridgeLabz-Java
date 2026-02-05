import java.util.function.BiFunction;

public class StringConcat {
    public static void main(String[] args) {
        BiFunction<String,String,String> join =
                (a,b) -> a+" "+b;

        System.out.println(join.apply("Hello","World"));
    }
}
