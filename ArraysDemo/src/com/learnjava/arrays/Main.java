package com.learnjava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static int[] baseData = new int[5];

    public static void main(String[] args) {

        System.out.println("test");

        int[] intNumbers = getIntegers(5);
        printNumbers(intNumbers);
        // System.out.println("The average of numbers is :" + getAverage(intNumbers));

        int[] sortedArray = sortNumbers(intNumbers);
        System.out.println("Sorted array ...");
        printNumbers(sortedArray);
        int[] newSortedArray = sortIntegers(intNumbers);
        System.out.println("New Sorted array ...");
        printNumbers(newSortedArray);

        System.out.println("resize array demo ...");
        baseData = getIntegers(5);
        printNumbers(baseData);
        resizeArray();
        baseData[5] = 99;
        baseData[6] = 100;
        printNumbers(baseData);

        System.out.println("Copy range of array values from one array to another using Arrays class:");
        int[] arrCopy = Arrays.copyOfRange(baseData, 0, 5);
        printNumbers(arrCopy);
        int[] arrCopy2 = Arrays.copyOf(baseData, baseData.length);
        printNumbers(arrCopy2);

        System.out.println("fill an array with default value...");
        int[] fillArray = new int[10];
        Arrays.fill(fillArray, 99);

        printNumbers(fillArray);

        System.out.println("Binary search in arrays ...");
        int key = 99;
        int index;
        index = Arrays.binarySearch(baseData, key);
        if (index >= 0 ) {
            System.out.println("key [" + key + "] found at [" + (index+1) + "] position and value is [" + baseData[index] + "]");
        } else {
            System.out.println("The specified key [" + key + "] not found in array. ");
        }

        System.out.println("linear search in arrays ...");
        searchkey(baseData, key);

    }

    public static int[] getIntegers(int capacity) {
        int[] numbers = new int[capacity];
        System.out.println("Please enter " + capacity + " integer values ...");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static void printNumbers(int[] array) {
        System.out.println("List of integers ...");
        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static double getAverage(int[] array) {
        double sum =0;
        for(int i =0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum/(double) array.length;
    }

    public static int[] sortNumbers (int[] numbers) {
        int[] sortedArray = Arrays.copyOf(numbers, numbers.length);
        boolean sorted = false;
        for (int i =0; i < sortedArray.length; i++ ) {
            System.out.print(".");
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j] > sortedArray[j+1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                    sorted = true;
                }
            }
            if (!sorted) break;
            sorted = false;
        }
        System.out.println();
        return sortedArray;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean quit = true;

        while(quit) {
            quit = false;
            System.out.print(".");
            for (int j =0; j < sortedArray.length - 1; j++) {
                if(sortedArray[j] > sortedArray[j+1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                    quit = true;
                }
            }
        }
        System.out.println();
    return sortedArray;
    }


    public static void resizeArray() {
        //int[] original = baseData;
        int[] original = Arrays.copyOfRange(baseData, 0, baseData.length);
        baseData = new int[7];
        for (int i =0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }

    public static void searchkey(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(".");
            if (array[i] == key) {
                System.out.println("Found key [" + key + "] at position [" + (i+1) + "]. ");
                break;
            }
        }

    }

}

