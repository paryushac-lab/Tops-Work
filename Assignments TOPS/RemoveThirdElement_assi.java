import java.util.ArrayList;
import java.util.Scanner;

public class RemoveThirdElement_assi {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // Adding elements
        list.add("Potato");
        list.add("Onion");
        list.add("Flower");
        list.add("Lady finger");
        list.add("Brinjal");

        // Display original list
        System.out.println("Original ArrayList: " + list);

        // Remove third element (index 2 because index starts from 0)
        list.remove(2);

        // Display updated list
        System.out.println("After removing third element: " + list);
    }
}
