package exceptions;

import java.util.InputMismatchException;

public class ZeroDivide {
    public static void main(String[] args) {
        int x = 10, y = 0;
        try {
            System.out.println(x / y); // graceful exit
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) { // generic exception (super class for all types of exceptions)
            System.out.println(e.getMessage());
        }
    }
}
