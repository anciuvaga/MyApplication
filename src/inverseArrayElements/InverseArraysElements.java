package inverseArrayElements;

import java.util.Arrays;

public class InverseArraysElements {
    public static void main(String[] args) {

        float [] floatArray  = {1.5f, 12.5f, 5.2f, 3.2f, 9.5f};

        int arrayLength = floatArray.length;

        for( int i = 0; i < arrayLength/2; i++) {
            float temp = floatArray[i];
            floatArray[i]  = floatArray[arrayLength - i - 1];
            floatArray[arrayLength-i-1] = temp;
        }
        System.out.println("array after reverse: " + Arrays.toString(floatArray) );

    }





}
