package com.company;

import com.company.chapter2.*;
import com.company.chapter3.operators.ArithmeticOperators;
import com.company.chapter3.operators.AssignmentOperators;
import com.company.chapter3.operators.ComparisonOperators;
import com.company.chapter3.operators.LogicalOperators;
import com.company.classes.Animal;
import com.company.control.flows.ControlFlows;
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

        int a = 1;
        System.out.println(-(-a));

        short w = 14;
        float x = 13;
        double y = 30;
        var z = w * x / y;

        int tadpole =(int) (5 * 2L);

        int wolf = 5;
        int coyote = (wolf = 3);

        boolean h = false;
        int h1 = 5;
        if(h = true) {
            System.out.println("Good");
        }
        /*if(h1 = 6) {
            System.out.println("Good");
        }*/

        if((h1 = 6) == 6) {
            System.out.println("Good");
        }

        Object o = new Object();

        Integer i =  Integer.valueOf(9); // new Integer()
        Double d = Double.valueOf(8.0); // new Double()

        Number num;
        num = i; // num -> Integer
        num = d; // num -> Double

        try {
            Casting.trySomethingWithExceptions(4);

        }catch(Exception ex){

            if(ex instanceof ArithmeticException){
                System.out.println("ArithmeticException class instance - please insert valid numbers");
            }

            if(ex instanceof  NullPointerException){
                System.out.println("NullPointerException class instance - please contact support");
            }
        }
    }
}
