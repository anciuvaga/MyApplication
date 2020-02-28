package arrays;

import java.util.Arrays;

public class BinarySearch {

    public static void countElements(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count = i;

            count++;
        }
        System.out.println("Size of the array is: " + count);

    }

    public static void printArray(int[] array) {
        System.out.println("---------------");
        for (int i = 0; i < array.length; i++) {

            System.out.print(" | " + i + " |");
            System.out.println(array[i] + " | ");
        }
        System.out.println("--------------");

    }

    public static void printAsList(int[] array) {

        System.out.println(Arrays.toString(array));

    }

    public static void binarySearch(int[] array, int value) {

        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {

            int middleIndex = (highIndex + lowIndex) / 2;
            if (array[middleIndex] < value) lowIndex = middleIndex + 1;
            else if (array[middleIndex] > value)
                highIndex = middleIndex - 1;
            else {
                System.out.println("Found the value - " + value + " at index: " + middleIndex);
                lowIndex = highIndex + 1;
            }
        }
    }

    public static void bubleSort(int[] array, int arraySize){

        for (int i = arraySize - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    swap (j, j + 1, array);
                    printAsList(array);
                }
            }

        }

    }

    public static void swap(int indexOne, int indexTwo, int[] array ) {

        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {5, 8, 9, 12, 14, 15, 18, 25, 29, 33, 36, 38, 40, 42, 45};

        int[] arr1 = {20, 5, 7, 2, 6, 13, 17};

        int arraySize = arr1.length;

        countElements(arr);

        printArray(arr);

        printAsList(arr);

        binarySearch(arr, 15);

        bubleSort(arr1, arraySize);

    }
}
