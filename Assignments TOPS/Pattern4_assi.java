import java.util.Scanner;

public class Pattern4_assi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Enter Number");
        number = scan.nextInt();
        for (int j = 1; j <= number; j++) {
            for (int k = 1; k <= j; k++)
                System.out.print(k);
            System.out.println();
        }
    }
}
