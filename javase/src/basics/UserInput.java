package basics;

import java.util.Scanner;

public class UserInput {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // have a Scanner object to take use Input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your Age: ");
        int age = scan.nextInt();

        System.out.printf("Welcome %s, you are %d years old \n", name, age);
        System.out.println("Welcome " + name + ", you are " + age + " years old" + "\n");

    }
}
