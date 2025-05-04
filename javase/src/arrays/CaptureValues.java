package arrays;

import java.util.Scanner;

public class CaptureValues {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scan = new Scanner(System.in);
        // Capture the names
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter User Name: ");
            names[i] = scan.next();
        }
        scan.close();
        // printing the names
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        // or simpler loop
        for (String string : names) {
            System.out.println(string);
        }
    }
}
