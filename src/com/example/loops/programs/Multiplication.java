package com.example.loops.programs;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

         // 10x1=10
        // 10x2=20

        // 10X10=100

        Scanner sc= new Scanner(System.in);

        System.out.println("please enter a number which multiplication you want?");

        int n=sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println( n+" X "+i+" = "+(n*i));  // "hi"+123 --->hi123
        }

        /*i=1 n=5   i<10     o/p              i++
                  1<10    5  X 1 = 5*1       2
                  2<10    5  X 2 = 5*2       3*/

    }
}
