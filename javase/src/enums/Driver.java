package enums;

public class Driver {
    public static void main(String[] args) {
        Account account = new Account(100, AccountType.FIXED);
        Account account2 = new Account(101, AccountType.SAVINGS);

        System.out.println(account);
        System.out.println(account2);

    }
}
