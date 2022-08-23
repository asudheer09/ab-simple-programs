package com.example.loops.whileloop;

import java.util.Scanner;

public class EvenOrOddUsingWhile {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("please enter a number");

        int n=sc.nextInt();

        // print first n - even numbers

        int i=0;

        while(i<=n){

            if(i%2==0){
                System.out.println("even "+i);
            }else{
                System.out.println("odd "+i);
            }

            i++;
        }



    }
}
