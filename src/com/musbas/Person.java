package com.musbas;

public class Person {
    // instance variables or properties or members variables
    private String firstName;
    private String lastName;
    private int age;
    private long phoneNumber;
    private Address address;
    
    public Person (String firstName, String lastName, int age, long phoneNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
public Person() {

}
    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public long getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {

        this.address = address;
    }

    public void printName(String fName, String lName){
        System.out.println(fName + " " + lName);
    }

}
