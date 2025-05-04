package methods;

public class ReturnTypeDemo {

    // instance methods
    // take a string and returning String
    String capitals(String s) {
        return s.toUpperCase();
    }

    // static method returning int
    static int add(int i, int j) {
        return i + j;
    }

    public static void main(String[] args) {
        ReturnTypeDemo rd = new ReturnTypeDemo();
        String res = rd.capitals("sometext");
        System.out.println(res);
        int result = ReturnTypeDemo.add(60, 20);
        System.out.println(result);

    }

}
