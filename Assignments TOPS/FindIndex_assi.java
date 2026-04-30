import java.util.Scanner;

public class FindIndex_assi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] no = { 10, 20, 30, 40, 50 };

        System.out.println("Enter element to find:");
        int key = scan.nextInt();

        int index = -1; // default if not found

        for (int i = 0; i < no.length; i++) {
            if (no[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
