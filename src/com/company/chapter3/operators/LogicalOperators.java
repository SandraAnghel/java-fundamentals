package com.company.chapter3.operators;

public class LogicalOperators {

    public static void tryLogicalOperators() {

        int x = 5;
        System.out.println("x is " + x);
        System.out.println("Logical AND operator: " +  (x >3 && x < 10));
        System.out.println("Logical OR operator: " + (x >3 || x <4));
        System.out.println("Logical NOT operator: " + (!(x > 3 && x <10)));


    }
}
