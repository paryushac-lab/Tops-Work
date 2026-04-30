import java.util.Scanner;

public class FactorialGivenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scan.nextInt();

        long factorial = 1;

        // Factorial is not defined for negative numbers
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Loop from 1 up to the number
            for (int i = 1; i <= num; i++) {
                factorial *= i;
                // Same as factorial = factorial * i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

    }
}
