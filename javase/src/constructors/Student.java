package constructors;

public class Student {
    int id;
    String name;
    int grade;
    float marks;

    // constructors are sepcial methods with the same name of the class
    // default constructor is present implicitly even if not mentioned
    public Student() {
        System.out.println("Default constructor called");
    }

    public static void main(String[] args) {
        // create an object of student
        Student s1 = new Student(); // calling the deafult constructor
    }

}
