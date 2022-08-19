package com.example.programs;

public class SumOfNumbers {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("total sum is " + sum);

       /* sum=0  i=0     i<=10     sum=sum+i    i++
                        0<=10    sum=0+0=0    1
                        1<=10    sum=0+1=1    2
                        2<=10    sum=1+2=3    3
                        3<=10    sum=3+3=6    4
                        4<=10    sum=6+4=10   5
                        5<=10    sum=10+5=15  6*/

    }
}
