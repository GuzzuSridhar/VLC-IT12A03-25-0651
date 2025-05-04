package classesandobjects;

public class Employee {
    public String name;
    public int age;
    public String dept;
    public float sal;
    public float annSal;

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
    }
}
