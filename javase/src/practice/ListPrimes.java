package practice;

import java.util.Scanner;

public class ListPrimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int input = scan.nextInt();
        boolean isPrime = true;

        for (int j = 3; j <= input; j++) {
            isPrime = true;
            for (int i = 2; i < input; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(j + ": is a prime number");
            }
        }
        scan.close();
    }
}
