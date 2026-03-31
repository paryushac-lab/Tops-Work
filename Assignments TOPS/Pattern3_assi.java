
public class Pattern3_assi {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // logic to print 1 and 0 alternately
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");

                }
            }
            System.out.println();// move to next line

        }
    }
}
