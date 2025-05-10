package abstraction.interfaces;

public class MayBank implements Bank {

    @Override
    public double fdInterest(double depAmt, int depPeriod) {
        double roi = 3.0f;
        double interest = (depAmt * depPeriod * roi) / 100;
        return interest;

    }

    @Override
    public double rdInterest(double depAmt, int depPeriod) {
        double roi = 3.0f;
        double interest = (depAmt * depPeriod * roi) / 100;
        return interest;
    }

    void someMethod() {
        System.out.println("Additional Methods");
    }

}
