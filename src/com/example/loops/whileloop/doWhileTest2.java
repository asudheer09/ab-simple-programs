package com.example.loops.whileloop;

public class doWhileTest2 {

    public static void main(String[] args) {

        System.out.println("============do-while==============");
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=10);


        int j=1;

        System.out.println("============while==============");

        while(j<=10){
            System.out.println(j);
            j++;
        }

        System.out.println("============for==============");

        for (int k = 1; k < 10; k++) {
            System.out.println(k);
        }
    }
}
