package basics;

public class Variables {
    public static void main(String[] args) {
        // declare single variable
        int x = 10; // variable with assignment of a value
        int y; // variable with no assignment

        // declare more than 1 variable of same type
        int a = 20, b, c = 89;
        // assigning a value to variable b
        b = 9;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // reference variable to another
        int g = 100;
        int h = g;
        System.out.println(h);

        byte by = (byte) g;

        int xy = by;

    }
}
