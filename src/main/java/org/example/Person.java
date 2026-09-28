package org.example;

public class Person {
    private String Name;
    private String email;

    public Person(String name, String email) {
        this.Name = name;
        this.email = email;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;

    }
}
