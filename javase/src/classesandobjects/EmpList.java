package classesandobjects;

public class EmpList {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Alex";
        e1.age = 34;
        e1.dept = "Sales";
        e1.sal = 5673.5f;

        e2.name = "Sara";
        e2.age = 29;
        e2.dept = "IT";
        e2.sal = 4564.44f;

        System.err.println(e1.name + " - " + e1.age + " - " + e1.sal + " - " + e1.dept);
        System.err.println(e2.name + " - " + e2.age + " - " + e2.sal + " - " + e2.dept);

        // creating arrays
        Employee[] empList = new Employee[100];

        // populating the array
        empList[0].name = "Alex";
        empList[0].age = 29;
        empList[0].sal = 6777f;
        empList[0].dept = "Sales";
        // Printing the array
        System.out.println(empList[0].name);
        System.out.println(empList[0].age);
        System.out.println(empList[0].sal);
        System.out.println(empList[0].dept);
    }
}
