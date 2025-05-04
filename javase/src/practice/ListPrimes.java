package practice;

import java.util.Scanner;

public class ListPrimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        boolean isPrime = true;
        int run = 1;

        int count = 0;
        System.out.print("Enter a Number: ");
        input = scan.nextInt();
        while (input > count) {
            isPrime = true;
            for (int i = 2; i < run; i++) {
                if (run % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(run + " ");
                count++;
            }
            run++;
        }
        scan.close();
    }
}
