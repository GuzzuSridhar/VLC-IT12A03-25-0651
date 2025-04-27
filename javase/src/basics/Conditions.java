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

        // Ternary operator
        // is a shorcut of if - else
        int age = 18;
        String status = (age > 18) ? "Major" : "Minor";
        System.out.println(status);

        // Switch Statement
        byte dow = 1;
        System.out.println("Enter a day of the week (1-7)");
        dow = input.nextByte();
        switch (dow) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of Week");
                // break;
        }

        // Merge Switch Statements
        switch (dow) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working Day");
                break;
            case 6:
            case 7:
                System.out.println("WeekEnd");
                break;
            default:
                System.out.println("Invalid day of Week");
                // break;
        }
        // Switch Expressions
        String dayStatus = switch (dow) {
            case 1, 2, 3, 4, 5 -> "Work Day";
            case 6, 7 -> "Week End";
            default -> "Invalid day";
        };
        System.out.println(dayStatus);

        input.close();
    }
}
