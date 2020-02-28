package arrays;

public class SortingTypes {

    int[] arr = new int[10];
    int arraySize = 10;

    public void createRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            arr[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void printArray() {
        for (int element : arr) {
            System.out.print("[ " + element + " ]");
        }
        System.out.println();
    }

    public void selectionSort() {

        for (int x = 0; x < arraySize; x++) {
            int minimum = x;
            for (int y = x; y < arraySize; y++) {
                if (arr[minimum] > arr[y]) {
                    minimum = y;
                }
            }
            swapValues(x, minimum);
            printArray();
        }

    }

    public void swapValues(int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
        public void insertionSort(){

            for(int i = 1; i < arraySize; i++){

                int j = i;

                int toInsert = arr[i];
                System.out.println("Before While");
                System.out.println("\nArray[i] = " + arr[i] +
                        " Array[j] = " + arr[j] + " toInsert = " + toInsert);
                printArray();
                System.out.println("In While");
                while((j > 0) && arr[j-1] > toInsert){

                    arr[j] = arr[j-1];
                    j--;
                }
                arr[j] = toInsert;


                System.out.println("\nArray[i] = " + arr[i] +
                        " Array[j] = " + arr[j] + " toInsert = " + toInsert);
                printArray();
            }
            System.out.println("After While");
            printArray();
        }

    public static void main(String[] args) {

        SortingTypes array = new SortingTypes();
        array.createRandomArray();
        array.printArray();
        // array.selectionSort();
        array.insertionSort();

    }
}