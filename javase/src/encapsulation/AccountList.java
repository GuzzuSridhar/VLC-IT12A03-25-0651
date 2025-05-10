package encapsulation;

import enums.AccountType;

public class AccountList {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(100, "John", 1989f);
        BankAccount bankAccount2 = new BankAccount(101, "Alex", 1897f, AccountType.SAVINGS);

        // not allowed to directly access the instance variables
        // bankAccount1.balance = 1988;
        // bankAccount2.balance = 1988;

        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount2.getBalance());

        // instead use the setter methods
        bankAccount1.setBalance(3000);
        bankAccount2.setBalance(5000);

        // using the getter methods
        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount2.getBalance());

    }
}
