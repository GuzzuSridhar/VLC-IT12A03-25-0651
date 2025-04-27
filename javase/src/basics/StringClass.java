package basics;

public class StringClass {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // working with Strings
        // strings are always in a double quotes
        // Strigs are arrays(collection) of characters
        // string in java are zero based indexed
        // Strings in java do not have negative index
        // Strings can containg alphanumeric values
        // Strings are case sensitive
        String name = "Alex"; // string literals
        System.out.println(name);
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        // System.out.println(name.charAt(4)); // error as the length is 4

        // getting the length of the String
        System.out.println(name.length());
        System.out.println(name.charAt(name.length() - 1));

        // Alphanumeric values
        String test = "abc123";
        test = "123";
        // converting the String to a number
        int convStr = Integer.parseInt(test);
        System.out.println(convStr);

        // ways to declare Strings
        // String Literal
        String strLiteral = "Literal";
        // String Object
        String strObj = new String("String Object");

        System.out.println(strLiteral);
        System.out.println(strObj);

        // Comparing String values
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello World";
        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String("Hello World");

        System.out.println(s1 == s2); // true (check based on Memory address)
        System.out.println(s1 == s3); // false (check based on Memory address)
        System.out.println(s1.equals(s2)); // true (check based on Values)

        System.out.println(s1 == s4); // false (check based on Memory address)
        System.out.println(s1.equals(s4)); // true (check based on Values)

        s2 = "hello";
        System.out.println(s1.equals(s2)); // false because of the casing
        System.out.println(s1.equalsIgnoreCase(s2)); // True because of the ignoring the casing

        // lowercase
        String t1 = "HELLO";
        System.out.println(t1.toLowerCase());
        // uppercase
        System.out.println(t1.toUpperCase());

        // substring
        t1 = "Welcome to Java";
        System.out.println(t1.charAt(8));
        System.out.println(t1.substring(8));
        System.out.println(t1.substring(8, 10));

        // joining Strings
        String one = "Hello";
        String two = "World";
        // concat
        System.out.println(one.concat(two));
        System.out.println(one.concat(" ").concat(two)); // method chaining
        // using the +
        System.out.println(one + " " + two);
        // trimming spaces
        t1 = "       Alex          ";
        System.out.println(t1.length());
        System.out.println(t1.trim().length());

        // escape characters
        // Alex's Car
        t1 = "Alex's Car";
        System.out.println(t1);
        t1 = "Alex\"s Car";
        System.out.println(t1);
        t1 = "Alex \n Car";
        System.out.println(t1);

        // Text Blocks
        t1 = """
                Write anything here
                and that will be
                saved with the "format inputted
                """;
        System.out.println(t1);

    }
}
