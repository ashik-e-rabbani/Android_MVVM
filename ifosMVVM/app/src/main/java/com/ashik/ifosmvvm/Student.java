package com.ashik.ifosmvvm;

public class Student {

    String id;
    String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
