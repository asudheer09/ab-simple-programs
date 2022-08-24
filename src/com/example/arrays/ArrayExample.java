package com.example.arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int[] myInt= {10,20,30,40,50};

        /*System.out.println(myInt[0]);
        System.out.println(myInt[1]);
        System.out.println(myInt[2]);
        System.out.println(myInt[3]);*/

        for (int i = 0; i < myInt.length; i++) {
            System.out.println(myInt[i]);
        }


        char[] chars= new char[5];
        chars[0]='a';
        chars[1]='e';
        chars[2]='i';
        chars[3]='o';
        chars[4]='u';

        for (int i = 0; i < 5; i++) {
            System.out.println(chars[i]);
        }


    }
}
