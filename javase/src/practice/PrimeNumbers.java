package practice;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int input = scan.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(input + ": is a prime number");
        } else {
            System.out.println(input + ": is not a prime number");
        }
        scan.close();
    }
}
