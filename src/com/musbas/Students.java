package com.musbas;

import java.util.List;

public class Students {

    private String Name;
    private List<Courses> courses;
    private char gender;
    private int age;
    private float gpa;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Students() {
        this.Name = Name;
        this.courses = courses;
        this.gender = gender;
        this.age = age;
        this.gpa = gpa;

    }

}
