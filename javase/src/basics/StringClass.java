package basics;

public class StringClass {
    public static void main(String[] args) {
        // working with Strings
        // strings are always in a double quotes
        // Strigs are arrays(collection) of characters
        // string in java are zero based indexed
        // Strings in java do not have negative index
        // Strings can containg alphanumeric values
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

    }
}
