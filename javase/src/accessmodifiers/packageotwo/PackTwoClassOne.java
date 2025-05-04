package accessmodifiers.packageotwo;

import accessmodifiers.packageone.PackOneClassOne;

public class PackTwoClassOne {
    public static void main(String[] args) {
        // testing the instance variables in the class outside the package
        PackOneClassOne tc = new PackOneClassOne();
        // System.out.println(tc.privateVar); // bad
        System.out.println(tc.publicVar); // good
        // System.out.println(tc.defaultVar); // bad
    }
}
