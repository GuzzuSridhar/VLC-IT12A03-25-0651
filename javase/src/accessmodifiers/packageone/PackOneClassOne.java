package accessmodifiers.packageone;

public class PackOneClassOne {
    private int privateVar; // same class
    public int publicVar; // global
    int defaultVar; // package private

    public static void main(String[] args) {
        // testing the instance variables within the same class
        PackOneClassOne tc = new PackOneClassOne();
        System.out.println(tc.privateVar); // good
        System.out.println(tc.publicVar); // good
        System.out.println(tc.defaultVar); // good
    }

}
