package com.laxamana.philip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words, if the array had the values in it 106, 26, 81, 5, 15, your program should
        // ultimately have an array with 106, 81, 26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods -- getIntegers, printArray, and sortIntegers.
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] myArray = getIntegers(5);
        System.out.print("Original Array: ");
        printArray(myArray);
        sortIntegers(myArray);
        System.out.println();
        System.out.print("Sorted Array: ");
        printArray(myArray);
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = array;

        int a, b, t;

        // Looks through the total number of elements
        for(a=1; a<sortedArray.length; a++){
            // Starts from the highest index, starts comparing the preceding index
            for(b=sortedArray.length-1; b >= a; b--){
                if(sortedArray[b-1] < sortedArray[b]){
                    t = sortedArray[b-1];
                    sortedArray[b-1] = sortedArray[b];
                    sortedArray[b] = t;
                }
            }
        }

        return sortedArray;
    }


    public static int[] getIntegers(int number){
        Scanner s = new Scanner(System.in);
        int[] array = new int[number];
        System.out.println("Enter " + number + " values: \r");

        for(int i=0; i<array.length; i++){
            array[i] = s.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }
}
