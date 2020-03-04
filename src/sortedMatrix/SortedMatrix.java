package sortedMatrix;

import java.util.Arrays;
import java.util.Random;

public class SortedMatrix {
    public int[][] pushDefaultValuesToArray(int n, int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = r.nextInt((max - min) + min) + 1;
        return arr;
    }
    public int[] sortLines(int[][] arr) {
        int n = arr[0].length;
        int[] arr_of_index = new int[n];
        int[] arr_of_sum = new int[n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                arr_of_sum[i] += arr[i][j];

                arr_of_index[i] = i;
            }
        int temp;
        int tempIndex;
        for (int i = 0; i < arr_of_sum.length; i++) {
            for (int j = 1; j < arr_of_sum.length; j++) {
                if (arr_of_sum[j - 1] > arr_of_sum[j]) {
                    temp = arr_of_sum[j - 1];
                    tempIndex = arr_of_index[j - 1];
                    arr_of_sum[j - 1] = arr_of_sum[j];
                    arr_of_index[j - 1] = arr_of_index[j];
                    arr_of_sum[j] = temp;
                    arr_of_index[j] = tempIndex;
                }
            }
        }

        return arr_of_index;
    }

    public void printArray(int[][] arr) {
        for (int[] value : arr) {
            for (int value1 : value)
                System.out.print(value1 + " ");
            System.out.println();
        }
    }
    public int[][] sortMatrixByLineSum(int[][] arr) {
        int[] arr_of_sorted_indexs = sortLines(arr);
        System.out.println(Arrays.toString(sortLines(arr)));
        int n = arr_of_sorted_indexs.length;
        int[][] arrSort = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arrSort[i][j] = arr[arr_of_sorted_indexs[i]][j];
        return arrSort;
    }

    public static void main(String[] args) {
        SortedMatrix sm = new SortedMatrix();
        int[][] arr = sm.pushDefaultValuesToArray(3, 1, 20);

        System.out.println("Unsorted Matrix:");
        sm.printArray(arr);

        arr = sm.sortMatrixByLineSum(arr);
        System.out.println("Sorted Matrix:");
        sm.printArray(arr);

        // .... aici deja va trebui deja sa fie chemata o functie care sorteaza matricea ....

    }
}