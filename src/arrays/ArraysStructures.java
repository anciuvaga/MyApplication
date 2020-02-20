package arrays;

public class ArraysStructures {

    private int [] theArray = new int[50];

    private int arraySize = 10;

    public void generateRandomArray(){

        for (int i = 0; i < arraySize; i++){
            theArray[i] = (int)(Math.random()*10) + 10;
        }
    }

    public int getIndexValue(int index) {
        if (index < arraySize) return theArray[index];

      return 0;

    }

    public void printArray() {
        System.out.println("-------------------");
        for(int i = 0; i < arraySize; i++){
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
        }
        System.out.println("-------------------");
    }
    public boolean doesArrayContainsThisValue(int searchValue) {
        boolean valueInArray = false;

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == searchValue) {

            }
        }
        return valueInArray = true;
    }

    public void deleteIndex(int index){
        if (index < arraySize) {
            for(int i = index; i < arraySize; i++){
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }
    public void insertValue(int value){
        if(arraySize<50){
            theArray[arraySize] = value;
        }
        arraySize++;
    }
    public String linearSearchForValue(int value){
        boolean valueInArray = false;
        String indexesWithValue = "";

        System.out.println("The value was found in the following indexes: ");

        for(int i = 0; i < arraySize; i++){
            if(theArray[i] == value){
                valueInArray = true;
                System.out.print(i + " ");

                indexesWithValue += i + " ";
            }
        }
        if(!valueInArray){
            indexesWithValue = "None";
            System.out.println(indexesWithValue);
        }

        return indexesWithValue;
    }

    public static void main(String[] args) {

        ArraysStructures newArray = new ArraysStructures();

        newArray.generateRandomArray();

        newArray.printArray();

        System.out.println(newArray.getIndexValue(3));

        System.out.println(newArray.doesArrayContainsThisValue(12));

        newArray.deleteIndex(2);

        newArray.printArray();

        newArray.insertValue(55);
        newArray.printArray();

        newArray.linearSearchForValue(11);

    }
}
