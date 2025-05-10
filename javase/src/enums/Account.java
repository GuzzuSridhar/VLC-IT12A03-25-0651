package enums;

public class Account {
    private int acctId;
    private AccountType type;

    public int getAcctId() {
        return acctId;
    }

    public void setAcctId(int acctId) {
        this.acctId = acctId;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public Account(int acctId, AccountType type) {
        this.acctId = acctId;
        this.type = type;
    }

    @Override
    public String toString() {
        return "acctId=" + acctId + ", type=" + type;
    }

}
