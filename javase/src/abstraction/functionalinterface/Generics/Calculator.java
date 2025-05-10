package abstraction.functionalinterface.Generics;

public class Calculator {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        double d = 10.9;
        double e = 20.9;
        short s = (short) 19;
        short t = (short) 29;

        String s1 = "Hello";
        String s2 = " World";

        // add
        Operation<Integer> addInts = (a, b) -> a + b;
        System.out.println("Result of Addition is: " + addInts.calculate(i, j));
        Operation<Double> addDoubs = (a, b) -> a + b;
        System.out.println("Result of Addition is: " + addDoubs.calculate(d, e));
        Operation<Short> addshrt = (a, b) -> (short) (a + b);
        System.out.println("Result of Addition is: " + addshrt.calculate(s, t));
        Operation<String> addstr = (a, b) -> a + b;
        System.out.println("Result of Addition is: " + addstr.calculate(s1, s2));
    }
}
