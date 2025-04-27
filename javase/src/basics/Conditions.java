package basics;

import java.util.Scanner;

public class Conditions {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        double salary = 5000, comm = 657.44;

        // if statement (standalone)
        if (salary > 5000) {
            System.out.println("The salary is more that 5000");
            System.out.println("The salary is more that 5000");
        }
        if (salary < 5000) {
            System.out.println("The salary is less that 5000");
        }

        // combine multiple if conditions
        if (salary > 5000) {
            System.out.println("The salary is more than 5000");
        } else if (salary < 5000) {
            System.out.println("The salary is less than 5000");
        }

        // using the default condition
        if (salary > 5000) {
            System.out.println("The salary is more than 5000");
            System.out.println("The salary is more than 5000");
            System.out.println("The salary is more than 5000");
            System.out.println("The salary is more than 5000");
        } else if (salary < 5000) {
            System.out.println("The salary is less than 5000");
        } else {
            System.out.println("The salary is 5000");
        }

        // if stmt with strings
        String pass = "Password", query = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Password: ");
        query = input.nextLine();
        if (pass.equals(query)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Invalid Password");
        }

        // if stmt with booleans
        boolean isGoodSal = salary > 6000;
        if (isGoodSal) {
            System.out.println("Good Salary");
        }
        input.close();

        // Ternary operator
        // is a shorcut of if - else
        int age = 18;
        String status = (age > 18) ? "Major" : "Minor";
        System.out.println(status);
    }
}
