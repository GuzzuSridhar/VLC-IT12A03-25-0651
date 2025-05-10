package practice;

import java.util.Scanner;

public class Account {
    // declaring the instance variables
    String accountNumber;
    String acccountHolderName;
    double balance;
    static Scanner scan = new Scanner(System.in);

    // define constructors
    public Account(String accountNumber, String acccountHolderName) {
        this.accountNumber = accountNumber;
        this.acccountHolderName = acccountHolderName;
    }

    public Account(String accountNumber, String acccountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.acccountHolderName = acccountHolderName;
        this.balance = balance;
    }

    // writing the methods for withdraw and deposit
    void deposit(double amt) {
        this.balance += amt;
        System.out.println("Deposited " + "an amout of $" + amt + " into the account " + this.accountNumber);
    }

    void withdraw(double amt) {
        this.balance -= amt;
        System.out.println(
                "Withraw " + "of an amout of $" + amt + " from the account " + this.accountNumber + " is successful");
    }

    void displayAccountInfo() {
        System.out.println("------------------------");
        System.out.println(this.accountNumber);
        System.out.println(this.acccountHolderName);
        System.out.println(this.balance);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Account[] accounts = new Account[1000];
        accounts[0] = new Account("A1", "Patrick", 100);
        accounts[1] = new Account("A2", "Jane", 150);
        accounts[2] = new Account("A3", "Bob", 200);
        accounts[3] = new Account("A4", "Sara");
        accounts[0].displayAccountInfo();
        accounts[1].displayAccountInfo();
        accounts[2].displayAccountInfo();
        accounts[3].displayAccountInfo();
        // deposit money into account A1
        accounts[0].deposit(1000);
        // withdraw from the account A1
        accounts[0].withdraw(50);
        // display the details of account A1 after the transactions
        accounts[0].displayAccountInfo();

    }
}
