package com.laxamana.philip;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] myIntArray = new int[10];

        for(int i=0; i<myIntArray.length; i++){
            Random rnd = new Random();
            int ran = rnd.nextInt(10);
            myIntArray[i] = ran;
        }

        printArray(myIntArray);
        System.out.println();
        System.out.println("Sum of all elements in the array is: " + sumOfArray(myIntArray));
    }

    public static void printArray(int[] intArray){
        for(int i=0; i<intArray.length; i++){
            System.out.println("Element #" + i + " contains:" + intArray[i]);
        }
    }
    public static int sumOfArray(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }

        return sum;
    }
}
