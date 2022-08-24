package com.example.arrays;

public class SumOfArrayNumbers {

    public static void main(String[] args) {
        int[] myArray={10,20,30,40,50};

        int sum=0;

        for (int i = 0; i < myArray.length; i++) {
            sum=sum+myArray[i];
        }

        System.out.println("finally this array sum is "+sum);

    }
}
