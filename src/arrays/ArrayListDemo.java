package arrays;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Creating a generic ArrayList
        ArrayList<String> arlTest = new ArrayList<String>();
        //Size of ArrayList
        System.out.println("Size of ArrayList at creation: " + arlTest.size());
        // Let's add some elements to it
        arlTest.add("D");
        arlTest.add("U");
        arlTest.add("K");
        arlTest.add("E");

        //Recheck the size after adding elements
        System.out.println("Size of ArrayList after adding elements: " + arlTest.size());

        //Display all contents of ArrayList
        System.out.println("List of all elements: " + arlTest);

        //Remove some elements from list
        arlTest.remove("D");
        System.out.println("See contents after removing elements by index: " + arlTest);

        //Remove elements by index
        arlTest.remove(2);
        System.out.println("See contents after removing element by index: " + arlTest);

        //Check if the list contains "K"
        System.out.println(arlTest.contains("K"));

    }
}
