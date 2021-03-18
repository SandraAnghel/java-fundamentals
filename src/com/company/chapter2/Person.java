package com.company.chapter2;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void sayHello(){
        System.out.println("Hello from: " + this.firstName + this.lastName);

    }
}
