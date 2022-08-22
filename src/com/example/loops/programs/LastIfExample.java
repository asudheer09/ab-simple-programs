package com.example.loops.programs;

public class LastIfExample {
    //ctrl+y delete entire line

    public static void main(String[] args) {
        float avg=34;

        if(avg>=75){ //80>=75 --true
            System.out.println("distinction");
        }else if(avg>=60 && avg<75){ //68>=60 && 68<75 --> true && true -->true , false && true--->false
            System.out.println("first class");
        }else if(avg>=45 && avg<60){ //true && true -->second class
            System.out.println("second class");
        }else if(avg>=35 && avg<45){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
}
