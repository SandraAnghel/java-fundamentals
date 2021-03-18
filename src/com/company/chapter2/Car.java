package com.company.chapter2;

public class Car {
    // Fields/Attributes/Instance Variables
    public String name;
    public String model;

    // Constructors
    public Car(){
    System.out.println("In constructor without parameters");
    }

    public Car(String name) {
        System.out.println("In constructor with name parameter " + name);
        this.name = name;
    }

    public Car(String name, String model) {
        System.out.println("In constructor with two parameters");
        this.name = name;
        this.model = model;
    }

    // Methods


}
