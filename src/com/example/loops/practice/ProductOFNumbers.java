package com.example.loops.practice;

public class ProductOFNumbers {

    public static void main(String[] args) {

        long product=1;

        for (int i = 1; i <= 10; i++) {
            product=product*i;
        }

        System.out.println("product of first 10 numbers are "+product);

    }
}
