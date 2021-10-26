package com.basukala;

public class Parent {

    protected String anyVariable;

    protected float simpleInterest(float principal, float rate, float time) {
        System.out.println(anyVariable);
        return (principal * rate * time)/100;
    }

    String retrunsStringDefault(){
        return "hello from Default package";
    }

    public String retrunsStringPublic(){
        return "hello from public method";
    }

    public static String returnStringPublicStatic(){
        return "Hello from public static method";
    }

}
