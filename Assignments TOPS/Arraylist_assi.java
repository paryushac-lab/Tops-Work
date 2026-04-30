import java.util.Scanner;

public class Arraylist_assi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Creating array
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Original Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " = " + arr[i]);
        }

        // Taking index and new value from user
        System.out.print("Enter index to update: ");
        int index = scan.nextInt();

        System.out.print("Enter new value: ");
        int newValue = scan.nextInt();

        // Checking valid index
        if (index >= 0 && index < arr.length) {
            arr[index] = newValue;

            System.out.println("Updated Array Elements:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Index " + i + " = " + arr[i]);
            }
        } else {
            System.out.println("Invalid Index!");
        }

    }
}
