import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistElements_assi {
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        System.out.println("ArrayList Elements: " + list);

        // 1. Using Simple For Loop
        System.out.println("\nUsing Simple For Loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 2. Using Enhanced For Loop (For-Each Loop)
        System.out.println("\nUsing Enhanced For Loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 3. Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 4. Using ListIterator (Forward Traversal)
        System.out.println("\nUsing ListIterator (Forward):");
        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        // 5. Using ListIterator (Backward Traversal)
        System.out.println("\nUsing ListIterator (Backward):");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        // 6. Using forEach() Method (Java 8+)
        System.out.println("\nUsing forEach() Method:");
        list.forEach(fruit -> System.out.println(fruit));
    }
}
