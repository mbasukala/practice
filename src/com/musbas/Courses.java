package com.musbas;

public class Courses {
   private String Name;
   private String Description;
   private float Marks;
   private String Teacher;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public float getMarks() {
        return Marks;
    }

    public void setMarks(float marks) {
        Marks = marks;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    public Courses(String name, String description, float marks, String teacher) {
        Name = name;
        Description = description;
        Marks = marks;
        Teacher = teacher;
    }
}
