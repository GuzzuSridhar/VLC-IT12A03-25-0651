package practice;

import java.util.Scanner;

public class Calculator {
    static void add() {
        Scanner scan = new Scanner(System.in);
        int input;
        int res = 0;
        System.out.print("Enter a Number to add: ");
        input = scan.nextInt();
        res += input;
        while (input != 0) {
            System.out.print("Enter a Number to add: ");
            input = scan.nextInt();
            res += input;
            scan.nextLine();
        }
        System.out.println(res);
    }

    static int choice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 for addition: ");
        System.out.println("2 for multiplication: ");
        System.out.print("Enter your choice: ");
        int ch = scan.nextInt();
        // scan.close();
        return ch;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = choice();

        if (choice == 1) {
            add();
            scan.close();
        }
    }
}
