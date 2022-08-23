package com.example.loops.whileloop;

import java.util.Scanner;

public class PrintSumOfNumbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter a number");
        int n=sc.nextInt();

        int i=0,sum=0;

        while(i<=n){
            sum=sum+i;
            i++;
        }

        System.out.println("sum of first "+n+" numbers is "+sum);

    }
}
