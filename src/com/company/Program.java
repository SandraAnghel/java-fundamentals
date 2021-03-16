package com.company;

import com.company.operators.ArithmeticOperators;
import com.company.operators.AssignmentOperators;
import com.company.operators.ComparisonOperators;
import com.company.operators.LogicalOperators;
import com.company.strings.StringExercises;

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

    }
}
