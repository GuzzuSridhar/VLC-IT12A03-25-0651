package classesandobjects;

public class StaticKeyWord {
    int id; // instance variable
    String name; // instance variable
    int grade; // instance variable
    float marks; // instance variable
    // static variables
    // 1. Shared accross instances
    // 2. declared using the static key word
    // 3. if the value is changed in any instance, it is reflacted in all instances.
    // 4. static variables can be accessed using the classname.staticvariable name
    // 5. can be accessed with the instance name also (not recomended)
    // 6. Static variables are loaded on to the memory even if an instance is not
    // created
    static String schoolName = "Shepards";

    public static void main(String[] args) {
        StaticKeyWord sk1 = new StaticKeyWord();
        StaticKeyWord sk2 = new StaticKeyWord();

        sk1.id = 1;
        sk1.name = "Alex";
        sk1.grade = 5;
        sk1.marks = 45;
        sk1.schoolName = "NewSchool"; // not recomended

        sk2.id = 2;
        sk2.name = "Jane";
        sk2.grade = 6;
        sk2.marks = 67;

        // print instance 1
        System.out.println(sk1.id
                + " "
                + sk1.name
                + " "
                + sk1.grade
                + " "
                + sk1.marks
                + " "
                + sk1.schoolName);
        // print instance 2
        System.out.println(sk2.id
                + " "
                + sk2.name
                + " "
                + sk2.grade
                + " "
                + sk2.marks
                + " "
                + StaticKeyWord.schoolName);

    }
}
