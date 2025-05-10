package abstraction.abstractclasses;

public abstract class Bank {
    public abstract int setInterest(); // abstract method

    public boolean canCloseAcct(String acctno) { // concrete method
        // logic
        return true;
    }
}
