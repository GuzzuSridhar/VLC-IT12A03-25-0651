package records;

public class Driver {
    public static void main(String[] args) {

        Person person = new Person("Alex", 35);
        Person person1 = new Person("Dave", 25);

        System.out.println(person.name() + " = " + person.age());
        System.out.println(person1.name() + " = " + person1.age());
    }

}
