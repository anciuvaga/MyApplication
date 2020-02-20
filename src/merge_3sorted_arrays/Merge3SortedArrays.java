package merge_3sorted_arrays;

import java.util.Arrays;

public class Merge3SortedArrays {
    public static void main(String[] args) {

        int a[] = {5, 6 ,7 ,9 , 10};
        int b[] = {2, 4, 5, 11, 17};
        int c[] = {1, 3, 5, 13, 15};

        int mergeAB[] = merge(a, b);
        int mergeFinal[] = merge(mergeAB, c);

        for(int i = 0; i < mergeFinal.length; i++){
            System.out.println(mergeFinal[i] + " ");
        }
        System.out.println(Arrays.toString(mergeAB));
    }
    public static int[] merge(int[] a, int [] b){

        int result[] = new int [a.length + b.length];

        int i = 0; //Initial index of first subarray
        int j = 0; //Initial index of second subarray
        int k = 0; //Initial index of merged subarray

        while (i < a.length && j< b.length) {
            if (a[i] <= b[j]) {
                result [k] = a[i];
                i++;
            }
            else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        /*
         *Copy the remaining elements of a[], if there are any
         */
        while(i<a.length){
            result[k] = a[i];
            i++;
            k++;
        }
        /*
         *Copy remaining elements of b[], if there are any
         */

        while(j<b.length){
            result[k] = b[j];
            j++;
            k++;
        }
         return result;
    }
}
