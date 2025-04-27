package basics;

public class Loops {
    public static void main(String[] args) {
        // while loop
        // dowhile loop
        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        // print reverse numbers
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        String test = "Hello";
        for (int i = test.length() - 1; i >= 0; i--) {
            System.out.print(test.charAt(i));
        }

        System.out.println("\n-----------------------Whiile loop--------------------");

        // while Loop
        int loopVar = 1;
        while (loopVar < 11) {
            System.out.println(loopVar);
            loopVar++;
        }

        System.out.println("\n-----------------------DoWhiile loop--------------------");
        // doWhile (one iteration mandated)
        loopVar = 100;
        do {
            System.out.println(loopVar);
            loopVar++;
        } while (loopVar < 11);

        System.out.println("\n-----------------------Nested loop--------------------");
        // nested Loops
        for (int i = 1; i <= 5; i++) {
            System.out.println(" Multiplication Table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        System.out.println("\n-----------------------Continue Statement--------------------");
        // contiunue statement exits the current iteration
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\n-----------------------Break Statement--------------------");
        // break statement exists the loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        System.out.println("This is executed");
    }
}
