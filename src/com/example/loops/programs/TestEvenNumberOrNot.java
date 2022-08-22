package com.example.loops.programs;

import java.util.Scanner;

public class TestEvenNumberOrNot {

    public static void main(String[] args) {

        //ClassName obj= new ClassName();

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number :");
        //to access any method we use objectName.methodName()
        int number=sc.nextInt();

        System.out.println("you have entered "+number);

        if(number%2==0){
            System.out.println("given number is even");
        }else {
            System.out.println("given number is odd");
        }

    }
}
