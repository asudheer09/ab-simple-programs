package com.example.programs;

import java.util.Scanner;

public class ReadDifferentTypesOfInput {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("please enter your name ");
        String name=sc.nextLine();

        System.out.println("please enter gender m or f ");
        String c=sc.next();

        System.out.println("please enter age");
        int age=sc.nextInt();

        System.out.println("please enter weight");
        float weight=sc.nextFloat();

        System.out.println("=================================");
        System.out.println("    Name: "+name);
        System.out.println("    Gender: "+c);
        System.out.println("    Age: "+age);
        System.out.println("    Weight: "+weight);
        System.out.println("=================================");



    }
}
