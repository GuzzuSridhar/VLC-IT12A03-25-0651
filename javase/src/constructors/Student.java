package constructors;

public class Student {
    int id;
    String name;
    int grade;
    float marks;

    // constructors are sepcial methods with the same name of the class
    // default constructor is present implicitly even if no constructor is mentioned
    // if any custom constructor is written, then the default implicit constructor
    // is no more present

    public Student() {

    }

    // overloaded constructor (fully loaded constructor)
    // rhis key word always refers to the current instance
    public Student(int id, String name, int grade, float marks) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

    // overloaded constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // create an object of student using the default constructor
        Student s1 = new Student(); // calling the deafult constructor
        s1.name = "Alex";
        s1.grade = 4;
        s1.marks = 87;

        // // create an object of student using the overloaded constructor
        Student s2 = new Student(10, "David");
        Student s4 = new Student(11, "James");
        Student s3 = new Student(12, "David", 6, 5464);
    }

}
