package abstraction.interfaces;

public class MayBank implements Bank, Govt {

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

    @Override
    public void myMethod() {
        System.out.println("second  Method");
    }

    public static void main(String[] args) {
        Govt.testStatic();
    }

}
