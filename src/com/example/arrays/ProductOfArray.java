package com.example.arrays;

public class ProductOfArray {

    public static void main(String[] args) {
        int[] ints={1,2,3,4,5};
        int prods=1;
        for (int i = 0; i < ints.length; i++) {
            prods=prods*ints[i];
        }
        System.out.println("product of array numbers is "+prods);

    }
}
