package exceptions;

public class ZeroDivide {
    public static void main(String[] args) {
        int x = 10, y = 0;
        try {
            System.out.println(x / y); // graceful exit
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
