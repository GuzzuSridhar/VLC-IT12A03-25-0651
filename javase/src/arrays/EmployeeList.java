package arrays;

import java.util.Scanner;

import classesandobjects.Employee;

public class EmployeeList {
    public static void main(String[] args) {
        Employee[] empList = new Employee[2];
        Scanner scan = new Scanner(System.in);

        // using a loop to populate the array
        for (int i = 0; i < empList.length; i++) {
            empList[i] = new Employee();
            System.out.print("Enter Employee Name: ");
            empList[i].name = scan.nextLine();
            System.out.print("Enter Employee age: ");
            empList[i].age = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Employee dept: ");
            empList[i].dept = scan.nextLine();
            System.out.print("Enter Employee sal: ");
            empList[i].sal = scan.nextFloat();
            scan.nextLine();
        }
        scan.close();

        // Printing the array
        for (Employee employee : empList) {
            System.out.println(employee.name + " " + employee.age + " " + employee.dept +
                    " " + employee.sal);
        }

    }
}
