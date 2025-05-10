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

// Method Overriding rules
/*
 * 1. Same Name
 * 2. Same Parameter List
 * 3. Same Return Type
 * 4. Accessmodifier cannot be more restrictive than the parent
 * 5. Private parent methods cannot be overridden
 * 6. Final methods cannot be overridden
 */
