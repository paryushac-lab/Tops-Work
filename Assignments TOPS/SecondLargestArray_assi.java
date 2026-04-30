public class SecondLargestArray_assi {
    public static void main(String[] args) {
        // Original number
        int[] number = { 10, 25, 49, 15, 39 };
        int largest = number[0];
        int secondLargest = number[0];
        // Find largest and second largest
        for (int i = 1; i < number.length; i++) {
            if (number[i] > largest) {
                secondLargest = largest;
                largest = number[i];
            } else if (number[i] > secondLargest && number[i] != largest) {
                secondLargest = number[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Second largest element: " + secondLargest);
    }
}
