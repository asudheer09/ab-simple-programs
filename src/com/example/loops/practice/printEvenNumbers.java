package com.example.loops.practice;

import java.util.Scanner;

public class printEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter the number ");

       int n= scanner.nextInt();

        for (int i = 0; i < n; i++) {

            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
