package arrays;

public class Loops {
    public static void main(String[] args) {
        String[] names = { "Alex", "Dave", "Smith", "Sara" };
        int[] nums = { 1, 5, 33, 55, 77, 22 };

        // using the while loop
        int x = names.length;
        while (x > 0) {
            System.out.println(names[--x]);
        }

        // for loop
        for (int num : nums) {
            System.out.println(num);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
