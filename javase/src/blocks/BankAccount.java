package blocks;

public class BankAccount {

    int acctNo;
    String acctName;
    double balance;
    static double roi;
    static int count;

    static {
        System.out.println("Static Block: Initializing the interest Rate");
        roi = 4.5;
    }

    {
        System.out.println("Instance Block: Initializing the Balance to default");
        balance = 1000.00;
        count++;
        System.out.println("there are " + count + " Accounts existing");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();
    }

}
