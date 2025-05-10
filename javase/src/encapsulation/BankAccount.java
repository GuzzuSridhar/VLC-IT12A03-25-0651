package encapsulation;

import java.time.LocalTime;

public class BankAccount {
    // encapsulation means that all the members are private
    private int acctId;
    private String acctName;
    private float balance;

    // for encapsulation there have to be a public getter and setter methods for
    // each property

    public BankAccount(int acctId, String acctName, float balance) {
        this.acctId = acctId;
        this.acctName = acctName;
        this.balance = balance;
    }

    public int getAcctId() {
        return acctId;
    }

    public void setAcctId(int acctId) {
        this.acctId = acctId;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        LocalTime now = LocalTime.now();
        if (now.getHour() >= 12)
            System.out.println("Out of Banking hours");
        else
            this.balance = balance;
    }

}
