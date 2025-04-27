package basics;

public class Conditions {
    public static void main(String[] args) {
        double salary = 5000, comm = 657.44;

        // if statement (standalone)
        if (salary > 5000) {
            System.out.println("The salary is more that 5000");
            System.out.println("The salary is more that 5000");
        }
        if (salary < 5000) {
            System.out.println("The salary is less that 5000");
        }

        // combine multiple if conditions
        if (salary > 5000) {
            System.out.println("The salary is more than 5000");
        } else if (salary < 5000) {
            System.out.println("The salary is less than 5000");
        }

        // using the default condition
        if (salary > 5000) {
            System.out.println("The salary is more than 5000");
        } else if (salary < 5000) {
            System.out.println("The salary is less than 5000");
        } else {
            System.out.println("The salary is 5000");
        }

    }
}
