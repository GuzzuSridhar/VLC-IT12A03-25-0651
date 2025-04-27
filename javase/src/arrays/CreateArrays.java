package arrays;

public class CreateArrays {
    public static void main(String[] args) {

        // Arrays are of fixed size
        // Arrays are homogenous
        // all arrays are zero index based

        // Ways to declare Arrays

        // decalre and instantiate values of an array with size 5
        int[] numbers = { 1, 4, 5, 77, 33 };
        // access the values
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println("--------------------------");

        // declare an array and instantiate seperately
        String[] names;
        names = new String[] { "Alex", "David", "Smith" };
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        System.out.println("--------------------------");
        // declare an arry with a specific size and not instantiate
        double[] salaries = new double[5];
        // default values
        System.out.println(salaries[0]);
        System.out.println(salaries[1]);
        System.out.println(salaries[2]);
        System.out.println(salaries[3]);
        System.out.println(salaries[4]);
        // assigning custom values
        salaries[0] = 8788.88;
        salaries[1] = 5768.88;
        salaries[2] = 8788.88;
        salaries[3] = 8788.88;
        salaries[4] = 8788.88;
        System.out.println(salaries[0]);
        System.out.println(salaries[1]);
        System.out.println(salaries[2]);
        System.out.println(salaries[3]);
        System.out.println(salaries[4]);

    }

}
