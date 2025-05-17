package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> namesList = new HashMap<>();
        namesList.put(1, "Alex");
        namesList.put(2, "Dave");
        namesList.put(3, "Alice");
        namesList.put(4, "Jim");
        namesList.put(5, "John");
        namesList.put(6, "Alex");
        namesList.put(7, "Alex");
        namesList.put(7, "A"); // overrides the earlier value with key 7

        for (Integer k : namesList.keySet()) {
            System.out.println(k + " - " + namesList.get(k));
        }
    }
}

/*
 * implements the Map interface
 * works on the concept of key value pair
 * Keys cannot be duplicated
 */