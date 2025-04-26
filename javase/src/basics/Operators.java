package basics;

public class Operators {
    public static void main(String[] args) {
        int x = 10, y = 20;
        // Arithmetic Operators
        System.out.println(x + y); // addition operator "+"
        System.out.println(x - y); // subtraction operator "-"
        System.out.println(x * y); // Multiplication operator "*"
        System.out.println(x / y); // Division operator "/"
        System.out.println(x % y); // Modulus operator "/"

        System.out.println(x++); // post increment "++"
        System.out.println(++x); // pre increment "++"
        System.out.println(x--); // post decrement "--"
        System.out.println(--x); // pre decrement "--"
        // Assignment Operators
        x = 30; // equal operator "="
        x += 20; // add and assign "+=" (is same as x = x + 20)
        System.out.println("x is " + x);
        x -= 20; // subtract and assign "-="
        System.out.println("x is " + x);
        x *= 20; // multiply and assign "*="
        System.out.println("x is " + x);
        x /= 20; // divide and assign "/="
        System.out.println("x is " + x);
        x %= 20; // modulo and assign "/="
        System.out.println("x is " + x);

        // Comparision Operators
        System.out.println(x == y); // equality
        System.out.println(x != y); // inequality
        System.out.println(x > y); // greater than
        System.out.println(x < y); // less than
        System.out.println(x >= y); // greater than or equals
        System.out.println(x <= y); // less than or equals

        // Logical Operators
    }
}
