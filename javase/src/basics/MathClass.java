package basics;

public class MathClass {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20;

        // Demo of Math class (java.lang.Math)

        // abs method returns a positive number
        System.out.println(Math.abs(n1 - n2));
        // round
        System.out.println(Math.round(7.4)); // 7
        System.out.println(Math.round(7.5)); // 8

        // Ceil
        System.out.println(Math.ceil(4.2));
        // floor
        System.out.println(Math.floor(4.2));

        // random
        System.out.println(Math.random());
        System.out.println(Math.round(Math.random() * 100));

        // pow
        System.out.println(Math.pow(2, 3));

        // sqrt
        System.out.println(Math.sqrt(3));
    }
}
