package arrays;

import java.util.Scanner;

import classesandobjects.Employee;

public class EmployeeList {
    public static void main(String[] args) {
        Employee[] empList = new Employee[5];
        Scanner scan = new Scanner(System.in);

        // using a loop to populate the array
        for (Employee employee : empList) {
            employee = new Employee();
            System.out.print("Enter Employee Name: ");
            employee.name = scan.nextLine();
            System.out.print("Enter Employee age: ");
            employee.age = scan.nextInt();
            System.out.print("Enter Employee dept: ");
            employee.dept = scan.nextLine();
            System.out.print("Enter Employee sal: ");
            employee.sal = scan.nextFloat();
        }
        scan.close();

        // Printing the array
        for (Employee employee : empList) {
            System.out.println(employee.name + " " + employee.age + " " + employee.dept + " " + employee.sal);
        }

    }
}
