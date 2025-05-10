package collections;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        // is an implementation of the set interface
        /*
         * unordered collection
         * no duplicates allowed
         */

        HashSet<String> names = new HashSet<>();

        // add method
        names.add("John");
        names.add("Alex");
        names.add("Alex"); // duplicate and will not be added
        names.add("Sara");

        // display elements
        for (String string : names) {
            System.out.println(string);
        }
        System.out.println("----------------");

        System.out.println(names);

        // remove method (only with values and no index)
        names.remove("Sara");

        // size method
        System.out.println(names.size());

        // clear method
        names.clear();
        System.out.println(names);

    }
}
