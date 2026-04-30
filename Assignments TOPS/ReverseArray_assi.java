public class ReverseArray_assi {
    public static void main(String[] args) {
        // Original number
        int[] number = { 10, 20, 30, 40, 50 };

        System.out.println("Original Number:");
        // Print original number
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println("\nReversed Number:");

        // Print number in reverse order
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }

}
