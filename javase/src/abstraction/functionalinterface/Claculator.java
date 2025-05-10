package abstraction.functionalinterface;

public class Claculator {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        // double d = 10.9;
        // double e = 20.9;

        // add
        Operation add = (a, b) -> a + b;
        System.out.println("Result of Addition is: " + add.calculate(i, j));
        /*
         * same as
         * int add(int x, int y){
         * return x+y}
         */

        // subtract
        Operation sub = (x, y) -> x - y;
        System.out.println("Result of subtraction is: " + sub.calculate(i, j));

        // Multiply
        Operation prod = (x, y) -> x * y;
        System.out.println("Result of multiplication is: " + prod.calculate(i, j));

        // Divide
        Operation div = (x, y) -> x / y;
        System.out.println("Result of division is: " + div.calculate(i, j));

    }
}
