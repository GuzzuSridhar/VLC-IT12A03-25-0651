package inheritence;

public class Child extends Parent {
    String childvar;

    // overidden default constructor
    public Child() {
        System.out.println("Child Constructor called");
    }

    // methods
    void childMethod() {
        System.out.println("Child method called");
    }

    @Override
    void favFood() {
        System.out.println("Child loves Chicken");
    }

    @Override
    void occupation() {
        System.out.println("Child is a student");
    }

}
