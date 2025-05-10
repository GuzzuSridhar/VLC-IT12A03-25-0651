package collections;

import java.util.ArrayList;

public class ArrayListDemo {

    // method to display names
    static void displayList(ArrayList<String> x) {
        System.out.println("----------------");
        for (String str : x) {
            System.out.println(str);
        }
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        /*
         * ArrayLists are Generic
         * bound less
         * can contain duplicates
         * Ordered Collections
         */

        // Methods in ArrayList
        // add method
        names.add("John");
        names.add("Alex");
        names.add("Alex");
        names.add("Sara");

        // size method
        System.out.println(names.size());

        // displaying the elements using the loop
        displayList(names);

        // set method - update an element
        names.set(2, "Jane");

        // displaying the elements using the loop
        displayList(names);

        // remove method - to delete elements
        names.remove(3);
        displayList(names);

        // indexOf method (if value is present the the index is returned otherwise -1)
        int temp = names.indexOf("Janes");
        System.out.println(temp);
    }
}
