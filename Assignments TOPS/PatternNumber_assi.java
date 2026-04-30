import java.util.Scanner;

public class PatternNumber_assi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
