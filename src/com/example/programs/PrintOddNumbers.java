package com.example.programs;

import java.util.Scanner;

public class PrintOddNumbers {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter a number");

        int n= scanner.nextInt();

        for (int i = 0; i <n; i++) {

            if(i%2!=0){
                System.out.println(i);
            }

        }
    }
}
