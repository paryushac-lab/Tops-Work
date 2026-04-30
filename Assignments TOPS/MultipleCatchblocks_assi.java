
import java.util.Scanner;

public class MultipleCatchblocks_assi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Division operation
            int result = num1 / num2;
            System.out.println("Result: " + result);

            // Array access
            int[] arr = { 10, 20, 30 };
            System.out.print("Enter index (0-2): ");
            int index = sc.nextInt();
            System.out.println("Array element: " + arr[index]);

        } catch (ArithmeticException e) {
            System.err.println(" Cannot divide by zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid array index.");

        } catch (Exception e) {
            System.err.println(" Invalid input. Please enter numeric values.");
        } finally {
            sc.close();
            System.out.println("Program execution completed.");
        }

    }
}
