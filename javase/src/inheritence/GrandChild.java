package inheritence;

public class GrandChild extends Child {
    String grandChildVar;

    public GrandChild() {
        System.out.println("Grand Child Constructor called");
    }

    // methods
    void grandChildMethod() {
        System.out.println("Grand Child method called");
    }

    @Override
    void favFood() {
        System.out.println("Child loves Ice Cream");
    }

    @Override
    void occupation() {
        System.out.println("Grand Child is an infant");
    }

}
