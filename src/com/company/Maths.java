package com.company;

public class Maths {
    public static void tryMathMethods(){

        System.out.println("Finding the max value between 5 and 10: " + Math.max(5, 10));
        System.out.println("Finding the min value between 5 and 10: " + Math.min(5, 10));
        System.out.println("Finding the square root of 64: " + Math.sqrt(64));
        System.out.println("Finding the absolute (positive) value of -4.7: " + Math.abs(-4.7));
        System.out.println("Returning a random number between 0.0(inclusive) and 1.0(exclusive): " + Math.random());

        int randomNum = (int)(Math.random() * 101);
        System.out.println("Returning a random number between 0 and 100: " + randomNum);
    }
}
