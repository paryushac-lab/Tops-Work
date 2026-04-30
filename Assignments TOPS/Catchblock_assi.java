import java.util.InputMismatchException;
import java.util.Scanner;

public class Catchblock_assi {
    public static void main(String[] args) throws ArithmeticException, InputMismatchException {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number ");
            int no = scan.nextInt();
            System.out.println(12 / 0);

            System.out.println("At the end of try ");
        } catch (InputMismatchException e) {
            System.err.println("java.util.InputMismatchException");
        } catch (Exception e) {

        } finally {
            System.out.println("Bye Bye");
        }
    }
}
