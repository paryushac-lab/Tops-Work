import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
