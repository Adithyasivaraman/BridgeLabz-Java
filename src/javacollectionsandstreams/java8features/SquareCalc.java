interface SquareCalc {
    int square(int x);

    default void print(int x){
        System.out.println("Square = "+square(x));
    }
}

public class SquareProgram {
    public static void main(String[] args) {
        SquareCalc calc = n -> n*n;
        calc.print(7);
    }
}
