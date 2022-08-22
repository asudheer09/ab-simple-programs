package com.example.loops.programs;

public class FactorialProgram {

    public static void main(String[] args) {
        int fact=1;
        for (int i = 1; i <= 5; i++) {
            fact =fact*i;
        }

        System.out.println("factorial of a number is "+fact);
    }
}
/*
syntax:
for(decleration ;condition; increment/decrement){

        }

*/


