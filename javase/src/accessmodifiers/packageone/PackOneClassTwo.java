package accessmodifiers.packageone;

public class PackOneClassTwo {
    public static void main(String[] args) {
        // testing the instance variables in a different class and same package
        PackOneClassOne tc = new PackOneClassOne();
        // System.out.println(tc.privateVar); // bad
        System.out.println(tc.publicVar); // good
        System.out.println(tc.defaultVar); // good
    }
}
