package com.example.programs;

import java.util.Scanner;

public class PrintFirst100Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

      /* n=10     i=0      i<=10            i++    o/p
                         0<=10 -->0%2=0    1       0
                         1<=10 -->1%2=1    2
                         2<=10 --> 2%2=0   3        2*/
    }
}
