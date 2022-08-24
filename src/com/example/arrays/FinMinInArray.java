package com.example.arrays;

public class FinMinInArray {

    public static void main(String[] args) {
        int[] ints= {10,4,2,3,1};

        int min=ints[0];

        for (int i = 0; i < ints.length; i++) {

            if(ints[i]<min){
                min=ints[i];
            }
        }

        System.out.println("min value from array is "+min);
    }
}
