public class MaxMinArray_assi {
    public static void main(String[] args) {
        int[] number = { 10, 25, 5, 40, 15 };

        int max = number[0];
        int min = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }

            if (number[i] < min) {
                min = number[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
