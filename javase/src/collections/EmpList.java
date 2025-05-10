package collections;

import java.util.ArrayList;

public class EmpList {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(100, 5000, "Alex", "Sales"));
        employees.add(new Employee(101, 5050, "John", "Sales"));
        employees.add(new Employee(102, 5040, "Sara", "Sales"));

        System.out.println("there are " + employees.size() + "employees");

        // print the employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
