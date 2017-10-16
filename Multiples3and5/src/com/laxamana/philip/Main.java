package com.laxamana.philip;


public class Main {

    public static void main(String[] args) {

        int multiplesOfThree = 0;
        int multiplesOfFive = 0;
        int sumOfThrees = 0;
        int sumOfFives = 0;

        for(int i=0; i<1000; i++){
            if(i%3==0){
                sumOfThrees+= i;
                multiplesOfThree++;
//                System.out.println(i);
            }
        }

        for(int i=0; i<1000; i++){
            if(i%5==0){
                sumOfFives+=i;
                multiplesOfFive++;
//                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("No. of Multiples of 3's: " + multiplesOfThree);
        System.out.println("No. of Multiples of 5's: " + multiplesOfFive);
        System.out.println("Sum of all multiple's of 3's = " + sumOfThrees);
        System.out.println("Sum of all multiple's of 5's = " + sumOfFives);
        System.out.println("The sum of both multiple's = " + sumOfFives + sumOfThrees);
    }
}
