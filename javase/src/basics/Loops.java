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

    }
}
