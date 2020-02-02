package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 6;
        intArray[6] = 7;
        intArray[7] = 8;
        intArray[8] = 9;
        intArray[9] = 10;

            int[] array1 = {2, 3, 4, 5, 6};

        int[] array = new int[7];
        for (int count = 2; count < 7; count++) {
            array[count] = count + 2;
            System.out.println("array[" + count + "] = " + array[count]);
        }
        System.out.println("Length of Array = " + array.length);
        // array[8] = 10;

        String[] b = {"Apple", "Mango", "Orange"};
        System.out.println("Before Function Call " + b[0]);
        ArrayDemo.passByReference(b);
        System.out.println("After Function Call " + b[0]);
        for (int i = 0; i < b.length; i++) {
            String x = b[i];
            System.out.println(x + " ");
        }

        for (String element : b) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(b));

        int[] arr = new int[5];
        arr[4] = 5;
        int arr1[] = {1, 5, 6, 8, 0};

        int[][] twoD = new int[4][4];

        // Assign four elements in it.

        twoD[0][0] = 1;
        twoD[1][2] = 2;
        twoD[2][3] = 4;
        twoD[3][3] = 5;

        System.out.println("Value before passing by reference " + twoD[3][3]);
        ArrayDemo.passMultidimentionalArrayByReference(twoD);
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void passByReference(String a[]) {
        a[0] = "Changed";
    }

    public static void passMultidimentionalArrayByReference(int twoD[][]) {
        twoD[3][3] = 10;
    }
}