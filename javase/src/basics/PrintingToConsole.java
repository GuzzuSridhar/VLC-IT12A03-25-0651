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
        System.out.printf("I am %s and my age is %d", name, age);

        // printing colors
        System.out.println("--------Print Colors---------------");
        System.out.println("\u001B[30m" + "This is Black text" + "\u001B[0m");
        System.out.println("\u001B[31m" + "This is red text" + "\u001B[0m");
        System.out.println("\u001B[32m" + "This is Green text" + "\u001B[0m");
        System.out.println("\u001B[33m" + "This is Yellow text" + "\u001B[0m");
        System.out.println("\u001B[34m" + "This is Blue text" + "\u001B[0m");
        System.out.println("\u001B[35m" + "This is Purple text" + "\u001B[0m");
        System.out.println("\u001B[36m" + "This is Cyan text" + "\u001B[0m");
        System.out.println("\u001B[37m" + "This is White text" + "\u001B[0m");

        System.out.println("\u001B[40m" + "This is text with Black Background " + "\u001B[0m");
        System.out.println("\u001B[41m" + "This is text with Red Background " + "\u001B[0m");
        System.out.println("\u001B[42m" + "This is text with Green Background " + "\u001B[0m");
        System.out.println("\u001B[43m" + "This is text with Yellow Background " + "\u001B[0m");
        System.out.println("\u001B[44m" + "This is text with Blue Background " + "\u001B[0m");
        System.out.println("\u001B[45m" + "This is text with Purple Background " + "\u001B[0m");
        System.out.println("\u001B[46m" + "This is text with Cyan Background " + "\u001B[0m");
        System.out.println("\u001B[47m" + "This is text with White Background " + "\u001B[0m");

        System.out.println("\u001B[1m" + "This is Bold text" + "\u001B[0m");
        System.out.println("\u001B[3m" + "This is Italic text" + "\u001B[0m");
        System.out.println("\u001B[4m" + "This is Underline text" + "\u001B[0m");
    }
}
