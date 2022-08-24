package com.example.arrays;

public class FindMaxInArray {

    public static void main(String[] args) {

        int[] myArray={98,45,105,19,214,31};

        int max=myArray[0]; //98

        for (int i = 0; i < myArray.length; i++) {

            if(myArray[i]>max){
                max=myArray[i];
            }
        }

        /*i=0 ,max=98        i< myArray.length      myArray[i]>max        i++
        ====================================================================
                            0<6 -->true      myArray[0] -->98>98 false    1
                            1<6    true      myArray[1]  -->45>98 false   2
            max=105         2<6    true      myArray[2]  -->105>98 true   3
                            3<6    true      myArray[3]      19>105 false  4
            max=214         4<6    true     myArray[4]      214>105 true   5
                            5<6    true     myArray[5]      31>214  false  6
                            6<6    false
                max=214*/

        System.out.println("max value of array is "+max);
    }
}
