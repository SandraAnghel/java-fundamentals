package com.company;

import com.company.chapter2.*;
import com.company.classes.Animal;
import com.company.control.flows.ControlFlows;
import com.company.operators.ArithmeticOperators;
import com.company.operators.AssignmentOperators;
import com.company.operators.ComparisonOperators;
import com.company.operators.LogicalOperators;
import com.company.strings.StringExercises;

import java.util.Random;
//import java.util.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("-----Variables-----");
        Variables.displayVariables();

        System.out.println("-----Implicit Casting-----");
        Casting.doImplicitCasting();

        System.out.println("-----Explicit Casting-----");
        Casting.doExplicitCasting();

        System.out.println("-----Arithmetic Operators");
        ArithmeticOperators.tryArithmeticOperators();

        System.out.println("-----Assignment Operators-----");
        AssignmentOperators.tryAssignmentOperators();

        System.out.println("-----Comparison Operators");
        ComparisonOperators.tryComparisonOperators();

        System.out.println("-----Logical Operators-----");
        LogicalOperators.tryLogicalOperators();

        System.out.println("-----Strings-----");
        StringExercises.workWithStrings();

        System.out.println("-----Maths-----");
        Maths.tryMathMethods();

        System.out.println("-----If Statements-----");
        ControlFlows.tryIfs();

        System.out.println("-----Switch Statements-----");
        ControlFlows.trySwitch();

        String animalName = Animal.name;
        Random r = new Random();

        Car car = new Car();
        System.out.println(car.name);

        Car car1 = new Car("Mercedes");
        System.out.println(car1.name);

        Car car2 = new Car("Audi");
        System.out.println(car2.name);

        Car car3 = new Car("BMW", "X5");
        System.out.println(car3.name + car3.model);

        Car car4 = new Car("BMW", "X5");
        System.out.println(car4.name + car4.model);

        System.out.println(car3 == car4);

        Car car5 = car4;
        System.out.println(car4 == car5);

        Person p1 = new Person("John", "Doe", 25);
        Person p2 = new Person("Andrew", "Doe", 35);
        p1.sayHello();
        p2.sayHello();
        p2.lastName = "Smith";
        p2.sayHello();

        Swan mother = new Swan();
        mother.numberEggs = 1;          // set variable
        System.out.println(mother.numberEggs);

        Bird bird = new Bird();

        Chick chick1 = new Chick();
        System.out.println(chick1.name);

        Egg egg = new Egg();
        System.out.println(egg.number);

        ShortAndChar.trySignedAndUnsigned();


    }
}
