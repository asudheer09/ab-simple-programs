package com.example.loops.whileloop;

public class WhileLoopTest {

    public static void main(String[] args) {

        // program to print first 10 numbers

        System.out.println("==========print using for loop==========");
        for (int i = 1; i <=10; i++) {

            System.out.println("hi " +i);

        }

        /*
            while(condition){
                //statements
            }
         */

        System.out.println("==========print using while loop==========");

        int j=1;

        while(j<=10){
            System.out.println("hello "+j);
            j++;
        }
    }
}
