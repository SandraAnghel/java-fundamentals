package com.company.chapter2;

public class Chick {
    public String name = "Fluffy";
    {System.out.println("setting field");}

    public Chick(){
        name = "Tiny";
        System.out.println("setting constructor");
    }

   /* public Chick() {
        System.out.println("In constructor");
    }*/

}
