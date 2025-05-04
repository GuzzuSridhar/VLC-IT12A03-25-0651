package methods;

public class MethodDemo {
    // syntax for a method
    // <access_modifier> [static] <return_type> <method_name>([parameters])
    // methods are used organize the code and create reusable code blocks
    // 1. if the static keyword is ignored, then the method is an instance method
    // 2. if it is included then it is a static method (class methods)

    // return type

    // instance method sample without return type and no parameters
    void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        // create an instance of the class
        MethodDemo md = new MethodDemo();
        MethodDemo md1 = new MethodDemo();
        md.sayHello();
        md1.sayHello();
        System.out.println("Done calling the method");
    }

}
