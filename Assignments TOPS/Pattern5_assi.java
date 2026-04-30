import java.util.Scanner;

public class Pattern5_assi {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        number = scan.nextInt();
        for (int j = 1; j <= number; j++) {
            for (int k = 1; k <= j; k++)
                System.out.print(j);
            System.out.println();
        }
    }

}
