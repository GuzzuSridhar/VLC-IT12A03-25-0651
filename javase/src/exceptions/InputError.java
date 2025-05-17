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
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid Number");
        }
        System.out.println("Other logic......");
        input.close();
    }
}
