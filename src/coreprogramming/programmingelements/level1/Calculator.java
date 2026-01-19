import java.util.Scanner;
class Calculator{
    Scanner sc = new Scanner(System.in);
    private double add(double a, double b){
        return a+b;
    }
    private double sub(double a, double b){
        return a-b;
    }
    private double mul(double a, double b){
        return a*b;
    }
    private double div(double a, double b) {
        return a/b;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int i = c.sc.nextInt();
        int j = c.sc.nextInt();
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+i+" and "+j+" is "+c.add(i,j)+", "+c.sub(i,j)+", "+c.mul(i,j)+", and "+c.div(i,j));
    }
}