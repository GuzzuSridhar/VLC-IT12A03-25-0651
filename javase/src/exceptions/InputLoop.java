package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        boolean isValidInput = false;
        System.out.print("Enter a number: ");
        while (!isValidInput) {
            try {
                age = scan.nextInt();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter a Valid Number.");
                scan.nextLine();
            }
        }
        System.out.println(age);
        scan.close();
    }

}
