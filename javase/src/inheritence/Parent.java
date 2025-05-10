package inheritence;

public class Parent {
    String parentVar;

    // overidden default constructor
    public Parent() {
        System.out.println("Parent class Constructor Called");
    }

    // methods
    void parentMethod() {
        System.out.println("Parent Method called");
    }

    void favFood() {
        System.out.println("Parent loves fish");
    }

    void occupation() {
        System.out.println("Parent is an Employee");
    }

}
