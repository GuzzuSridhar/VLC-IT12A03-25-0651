package inheritence;

public class Main {

    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();

        grandChild.parentVar = "x";
        grandChild.childvar = "y";
        grandChild.grandChildVar = "y";

        grandChild.parentMethod();
        grandChild.childMethod();
        grandChild.grandChildMethod();

        grandChild.favFood();
        grandChild.occupation();
    }

}
