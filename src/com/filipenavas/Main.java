package com.filipenavas;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        System.out.println("BEFORE SORT");
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }



        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            for(int i = 0; i < lastUnsortedIndex; i++){

                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i+1);
                }

            }
        }

        System.out.println("AFTER SORT");
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }


    private static void swap(int[] array, int i, int j){

        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
