package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // Employee employee = new Employee(100, "Alex");
        // write the employee object to a file
        // Serialization
        // try {
        // FileOutputStream out = new FileOutputStream("emp.ser");
        // ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        // objectOutputStream.writeObject(employee);
        // System.out.println("Object is written to a file");
        // objectOutputStream.close();
        // out.close();

        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // deserialization - read from the .ser file
        try {
            FileInputStream fileInputStream = new FileInputStream("emp.ser");
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            Employee readEmp = (Employee) in.readObject();
            System.out.println(readEmp);
            in.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
