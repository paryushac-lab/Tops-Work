
import java.util.Scanner;

public class CheckMarks_assi {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int marks;
        System.out.println("Enter Marks: ");
        Scanner scan = new Scanner(System.in);
        marks = scan.nextInt();
        if (marks >= 0 && marks <= 40) {
            System.out.println("Fail");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade DD");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade CD");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade BC");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade BB");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade AB");
        } else if (marks >= 91 && marks <= 100) {
            System.out.println("Grade AA");
        } else {

            System.out.println("Invalid Marks");
        }
        scan.close();
    }
}
