package com.example.loops.practice;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // 9 X 1=9
        // 9 X 2=18

        Scanner sc= new Scanner(System.in);
        System.out.println("please enter a number ");
        int n=sc.nextInt();

        if(n==1){
            System.out.println("you have entered 1");
        }else{

            if(n<=20){

                for (int i = 1; i <10 ; i++) {

                    System.out.println(n+"  X  "+i+" = "+(n*i));
                }
            }else{
                System.out.println("sorry man I cant write more!");
            }
        }

    }
}
