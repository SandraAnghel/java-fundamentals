package com.company;

public class Casting {
    public static void doImplicitCasting(){
        int i1 = 9;
        double d1 = i1;
        System.out.println(i1);
        System.out.println(d1);

        byte b1 = 127;
        short s1 = b1;
        System.out.println(b1);
        System.out.println(s1);

        char c1 = 'a';
        System.out.println(c1);
        int i2 = c1;
        System.out.println(i2);
    }

    public static void doExplicitCasting(){
        double d2 = 12.4567345623;
        float f1 = (float) d2;
        System.out.println(d2);
        System.out.println(f1);

        float f2 = 14.123456f;
        long l1 = (long) f2;
        System.out.println(f2);
        System.out.println(l1);

        int i3 = 90;
        char c2 = (char) i3;
        System.out.println(i3);
        System.out.println(c2);

    }

    public static void trySomethingWithExceptions(int n) throws Exception {
        if(n > 5){
            throw new NullPointerException("NullPointerException class instance");
        }else{
            throw new ArithmeticException("ArithmeticException class instance");
        }

    }
}
