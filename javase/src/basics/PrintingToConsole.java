package basics;

public class PrintingToConsole {
    public static void main(String[] args) {
        // println prints on a new line always
        System.out.println("Line 1");
        System.out.println("Line 2");
        // print prints on the same line
        System.out.print("Line 1");
        System.out.print("Line 2");
        // System.out.println();

        int age = 25;
        String name = "Alex";
        // printing variables with text
        System.out.println("\n" + "Hello, My Age is " + age);

        // using the format
        System.out.printf("I am %s and my age is %d \n", name, age);
    }
}
