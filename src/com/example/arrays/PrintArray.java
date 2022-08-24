package com.example.arrays;

public class PrintArray {

    public static void main(String[] args) {
        int[] intArray= new int[5];

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        int a=10;
        System.out.println(a);

        System.out.println(intArray);

        float[] floats= new float[3];

        for (int i = 0; i < floats.length; i++) {
            System.out.println(floats[i]);
        }

        char[] chars= new char[3];

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

    }
}
