package com.company.strings;

public class StringExercises {
    public static void workWithStrings(){

        String greeting = "Hello";
        System.out.println(greeting);
        System.out.println("The length of the greeting is: " + greeting.length());
        System.out.println("Transform all the letters to uppercase: " + greeting.toUpperCase());
        System.out.println("Transform all the letters to lowercase: " + greeting.toLowerCase());
        System.out.println("Index of character 'o' from greeting is: " + greeting.indexOf("o"));

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println("String concatenation: " + (firstName + lastName));
        System.out.println(firstName.concat(lastName));

        String text = "We are the so-called \"Vikings\" from the north";
        System.out.println("Using \"\" escape character: " + text);

        String txt = "It\'s alright.";
        System.out.println("Using \' escape character: " + txt);

        String txt2 = "The character \\ is called backslash";
        System.out.println("Using \\ escape character: " + txt2);

        String txt3 = "Hello\nWorld!";
        System.out.println("Using the new line escape character :" + txt3);

        String txt4 = "Hello\rWorld!";
        System.out.println("Using carriage return escape character: " + txt4);

        String txt5 = "Hello\tWorld!";
        System.out.println("Using tab escape character: " + txt5);

        String txt6 = "Hel\blo World!";
        System.out.println("Using backspace escape character: " + txt6);

        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println("If two strings are added, the result will be a string concatenation: " + z);

        String s = "10";
        int i = 20;
        String m = s + i;
        System.out.println("If a string and a number are added, the result will be a string concatenation: " + m);

    }

}
