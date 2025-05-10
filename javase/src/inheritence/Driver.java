package inheritence;

public class Driver {

    public static void main(String[] args) {

        Child child = new Child();
        child.childvar = "Child";
        child.childMethod();

        // accesing the parent class props and methods with child instance
        System.out.println(child.parentVar);
        child.parentMethod();
        child.favFood();
        child.occupation();

        Parent parent = new Parent();
        parent.parentVar = "Parent";
        parent.favFood();
        parent.occupation();
        parent.parentMethod();
    }
}
