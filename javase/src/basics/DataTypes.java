package basics;

public class DataTypes {
    public static void main(String[] args) {
        // Single Line Comment
        /*
         * Multi Line comment
         * line 1
         * lin 2
         * line 3
         */
        System.out.println("Data Types");

        /*
         * primitive types
         * 1. byte
         * 2. short
         * 3. int
         * 4. long
         * 5. float
         * 6. double
         * 7. boolean
         * 8. char
         */
        // declare a byte type variable
        // 8 bit signed integer
        byte age = 26;

        // declare a short type variable
        // 16 bit signed integer
        short count = 78;

        // declare a int type variable
        // 32 bit signed integer
        int counts = 190;

        // declare a long type variable
        // 64 bit signed integer
        long months = 189;

        // declare a float type variable
        // 32 bit signed floating pount value
        float salary = 7889.87f; // f is used to denote the float type as all decimal numbers are double by
                                 // default

        // declare a double type variable
        // 64 bit signed floating pount value
        double incentive = 6766.77;

        // declare a boolean variable
        boolean isGood = true;

        // declare a char type variable
        char type = 'a';

        // printing the variable values
        System.out.println(age);
        System.out.println(count);
        System.out.println(counts);
        System.out.println(months);
        System.out.println(salary);
        System.out.println(incentive);
        System.out.println(isGood);
        System.out.println(type);

    }

}
