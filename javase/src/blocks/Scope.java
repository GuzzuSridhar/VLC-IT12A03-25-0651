package blocks;

public class Scope {
    /*
     * instance variables (instance scope)
     * can be accesses anywhere within the instance (Name) in any method
     */
    int instanceVar;

    /*
     * Static variables
     * also called as class variables
     * can be used in a global scope (anywhere in any instance and any method)
     * should be accessed with the classname.variable name syntax
     */
    static int staticVar;

    // instance nethod
    void instanceMethod() {

        /*
         * instance methods can only be referenced with an instance and not otherwise
         * local variables
         * scope of the local variable is only within the block
         * Local variables are to be instantiated before being used
         */
        int localVar = 102;
        System.out.println("localVar in the instance method is " + localVar);

        // accessing the instance variable using an instance
        Scope scope = new Scope();
        scope.instanceVar = 100;

        // accessing the static variable using the class name
        staticVar = 100;

        staticMethod();
    }

    // static method
    static void staticMethod() {
        // accessing the instance variable using an instance
        Scope scope = new Scope();
        scope.instanceVar = 101;
        // localVar = 189; // not allowed as it is out of scope

        // accessing the static variable using the class name
        // staticVar = 101; use the Scope.staticVar outside this class

        // instanceMethod(); // not allowed
        // scope.instanceMethod(); //
    }

    public static void main(String[] args) {
        int localVar = 10;
        // accessing the static variable
        System.out.println(staticVar);
        // accessing the instance variable
        Scope scope = new Scope();
        System.out.println(scope.instanceVar);
        // accessing the local variable
        System.out.println("localVar in the main method is " + localVar);
        // accessing the instance method
        scope.instanceMethod();
        // // accessing the static method
        // Scope.staticMethod();
        // staticMethod();

    }
}
