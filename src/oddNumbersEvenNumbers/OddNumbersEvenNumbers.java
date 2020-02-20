package oddNumbersEvenNumbers;

import java.util.Arrays;

public class OddNumbersEvenNumbers {
    public static void main(String[] args) {

        int [] arr = {2, 5, 8, 11, 17};

        calculate(arr);
    }
    public static void calculate(int [] arr){
        int even_count = 0;
        int odd_sum = 0;


        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] % 2 == 0 ){
                even_count++;
            }
            else{
                odd_sum = odd_sum + arr[i];
            }
        }
        System.out.println("Elements of the array are: "+ Arrays.toString(arr));
        System.out.println("Count of even numbers :" + even_count + "\nSum of odd numbers: " + odd_sum );

    }
}
