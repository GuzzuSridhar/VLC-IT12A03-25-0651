package collections;

public class Employee {
    private int eid;
    private float sal;
    private String name;
    private String dept;

    public Employee(int eid, float sal, String name, String dept) {
        this.eid = eid;
        this.sal = sal;
        this.name = name;
        this.dept = dept;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", sal=" + sal + ", name=" + name + ", dept=" + dept + "]";
    }

}
