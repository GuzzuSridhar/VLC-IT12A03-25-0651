package records;

// what all the Person record does implicitly is the following
public class PersonClass {
    private String name;
    private int id;

    public PersonClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PersonClass [name=" + name + ", id=" + id + "]";
    }

}
