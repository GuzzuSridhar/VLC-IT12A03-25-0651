package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputError {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a Number: ");
            int i = input.nextInt();
            System.out.println(i);
        } catch (InputMismatchException e) { // executed only when a exception occurs (raised)
            System.out.println("Enter a valid Number");
        } finally { // executed always
            input.close();
        }
        System.out.println("Other logic......");

        // Scanner input = new Scanner(System.in);

        // System.out.print("Enter a Number: ");
        // int i = input.nextInt();
        // System.out.println(i);
        // input.close();
        // System.out.println("Other logic......");
    }
}
