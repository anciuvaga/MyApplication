package bubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    static int[] bubbleSort(int[] arr) {
        int temp = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");

        System.out.println(Arrays.toString(arr));

        System.out.println("Array After Bubble Sort Algoritm implementation: ");

        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }

}

