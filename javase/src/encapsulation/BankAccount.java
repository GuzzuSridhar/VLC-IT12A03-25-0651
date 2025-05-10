package encapsulation;

import java.time.LocalTime;

import enums.AccountType;

public class BankAccount {
    // encapsulation means that all the members are private
    private int acctId;
    private String acctName;
    private float balance;
    private AccountType type;

    // for encapsulation there have to be a public getter and setter methods for
    // each property

    public BankAccount(int acctId, String acctName, float balance) {
        this.acctId = acctId;
        this.acctName = acctName;
        this.balance = balance;
    }

    public BankAccount(int acctId, String acctName, float balance, AccountType type) {
        this.acctId = acctId;
        this.acctName = acctName;
        this.balance = balance;
        this.type = type;
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

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

}

// by ignoring the setter method for any member variable it becomes read-only