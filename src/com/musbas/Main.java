package com.musbas;

import com.basukala.Parent;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        int[] arr = {5, 7, 1, 2, 10, 66, 344, 652, 6789, 5, 99};
        System.out.println("Even Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(i + "th item from array: " + arr[i]);
            }
        }

//        printFordCar();

//        printHondaCar();
//        printPersonAddress();
        printPerson2();

        //Students performance = new Students("Crish", "Brown", 'M',30, 3.8F);
        // System.out.println(performance.getGender());
        // System.out.println(performance.getGpa());
//
//        Calculator calculator = new Calculator();
//        int sum = calculator.calculateSum(2,3);
//        System.out.println("Sum of 2 and 3 is : " + sum);
//        System.out.println("Sum multiplied by 10: " +sum*10);


        Parent interest = new Parent();
//        float SI = interest.simpleInterest(20000F, 0.05F, 8);
//        System.out.println(SI);
        interest.retrunsStringPublic();

        Parent.returnStringPublicStatic();

    }

    private static void printPerson2() {

        Person p2 = new Person();
        p2.printName("James", "Bond");

    }

    private static void printHondaCar() {
        Car honda = new Car("Honda", null, 2, 2);
        honda.setTires(4);
//
//        System.out.println(honda.getEngine() + " engine has " + honda.getDoors() + " doors.");
//        System.out.println(honda.getTires());
    }

    private static void printFordCar() {
        //Car class example

        Car ford = new Car();
        ford.setEngine("abc");
        ford.setDoors(4);
        ford.setTires(5);
        ford.setWindows(4);

        System.out.println("===============Ford=======================");
        System.out.println(ford.getEngine());
        System.out.println(ford.getTires());
    }

    private static void printPersonAddress() {

        Address home = new Address();
        home.setStreetNumber(762);
        home.setStreetName("Cardwell Circle");
        home.setCity("Livonia");
        home.setState("Michigan");
        home.setAptNumber(71723);

        Person women = new Person();
        women.setFirstName("Muskan");
        women.setLastName("Basukala");
        women.setAge(55);
        women.setAddress(home);
        women.setPhoneNumber(1_657_872_901);

//        System.out.println(printName(women.getFirstName(), women.getLastName()));


//        System.out.println(women.getFirstName() + " lives in " + women.getAddress().getCity());


//        Courses marks = new Courses(80.5F, 70.5F, 90.5F);
//        float avg = (marks.getMath() + marks.getScience() + marks.getEnglish())/3;
//        System.out.println(women.getFirstName() + " " + women.getLastName() + " got " + avg + " in average.");


//        int maths = 80;
//        int english = 90;
//        int science = 75;
//        float Average = (maths + english + science)/3;
//        System.out.println(Average);
//
//        System.out.println(women.getFirstName() + " " + women.getLastName() + " got " + Average + " in average.");

        printStudentCourses();


    }

    private static String printName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private static void printStudentCourses() {

        Courses maths = new Courses("math", "love numbers", 80.0F, "Umanath");
        Courses science = new Courses("sci", "like logic", 70.0F, "Subedi");
        Courses english = new Courses("eng", "language", 90.0F, "Sarita");

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(maths);
        coursesList.add(science);
        coursesList.add(english);

        Students muskanStudent = new Students();
        muskanStudent.setName("Muskan Basukala");
        muskanStudent.setCourses(coursesList);
        muskanStudent.setGender('F');
        muskanStudent.setAge(24);
        muskanStudent.setGpa(3.34F);

//        float average = (maths.getMarks() + science.getMarks() + english.getMarks())/3;
//        System.out.println(muskanStudent.getName() + " got " + average + " in average.");

        float mathsMarks = muskanStudent.getCourses().get(0).getMarks();
        float scienceMarks = muskanStudent.getCourses().get(1).getMarks();
        float englishMarks = muskanStudent.getCourses().get(2).getMarks();
        float Average = (mathsMarks + scienceMarks + englishMarks) / 3;
        System.out.println(Average);
        System.out.println(muskanStudent.getName() + " got " + Average + " in average.");


//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 15;
//        numbers[2] = 19;

//        System.out.println(numbers[1]);


        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");

//        System.out.println("Third item in fruits: " + fruits.get(2));


//            int numbers = 10;
//            System.out.println("Even numbers: ");
//            for (int i = 1; i <= numbers; i++) {
//                if (i % 2 == 0)
//                    System.out.println(i);
    }








    }




