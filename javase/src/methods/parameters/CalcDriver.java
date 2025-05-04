package methods.parameters;

public class CalcDriver {
    public static void main(String[] args) {
        float result = 0;
        result = Calculator.add(100, 700);
        System.out.println(result);
        result = Calculator.add(100, 700, 8000);
        System.out.println(result);
        result = Calculator.add(100, 700, 8000, 5778);
        System.out.println(result);
        result = Calculator.add(100, 700, 8000, 5778, 5, 6, 7, 8, 8);
        System.out.println(result);

        result = Calculator.sub(100, 700);
        System.out.println(result);

    }
}
