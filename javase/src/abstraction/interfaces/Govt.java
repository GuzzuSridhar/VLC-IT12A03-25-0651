package abstraction.interfaces;

public interface Govt {
    void myMethod();

    // default methods are concrete
    default void yourMethod() {

    }

    // static methods are concrete
    static void testStatic() {
        System.out.println("Static method");
    }
}
