package com.company.control.flows;

public class ControlFlows {
    public static void tryIfs() {
        int a = 100;
        int b = 1000;
        if(a > b) {
            System.out.println("a is greater than b");
        }else {
            System.out.println("b is greater than a");
        }

        if(a / 2 == 50) {
            System.out.println("Half of a is 50");
        }

        if(a / 2 > b % 3) {
            System.out.println("Condition is true");
        }

        String c = "test";
        int cLength = c.length();

        if(cLength == 4) {
            System.out.println("c length is 4");
        }


        if(c.toUpperCase() == "TEST") {
            System.out.println("c uppercase is TEST");
        }

        if(b < a){
            System.out.println("b is less than a");
        }else if(b < 900) {
            System.out.println("b is less than 900");
        }else{
            System.out.println("b is greater than 900");
        }

        String d = "hello";
        String e = "hello";
        if(d == e) {
            System.out.println("d is equal to e");
        }else{
            System.out.println("d is not equal to e");
        }

        if(a == 1 && a == 2 && a == 3 || b == 5) {
            System.out.println("Complex condition");
        }
    }

    public static void trySwitch() {
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }
        int month = 1;
        switch(month) {
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            default:
                System.out.println("Unknown month");
                break;
        }

        String userName = "test";
       /* String userNameLowerCase;
        if(userName == null) {
            userNameLowerCase = "";
        }else{
            userNameLowerCase = userName.toLowerCase();
        }*/

        String userNameLowerCase = userName == null ? "" : userName.toLowerCase();

        switch(userNameLowerCase){
            case "test":
                System.out.println("Authenticated user");
                break;
            default:
                System.out.println("Unauthenticated user");
                break;
        }

    }
}
