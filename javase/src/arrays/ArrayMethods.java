package arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        // decalre an array
        int[] nums = { 100, 11, 102, 105, 104 };

        // length
        System.out.println(nums.length);

        // print the array
        System.out.println(Arrays.toString(nums));

        // sort the arrays
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // fill the array
        int[] x = new int[5];
        Arrays.fill(x, 3);
        System.out.println(Arrays.toString(x));

        // compare arrays (output of 0 means same size and values)
        int[] y = new int[5];
        Arrays.fill(y, 3);

        System.out.println(Arrays.compare(x, y));
    }
}
