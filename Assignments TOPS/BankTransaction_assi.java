import java.util.Scanner;

// Custom Exception Class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransaction_assi {

    public static void main(String[] args) {
        int balance = 2000;

        Scanner scan = new Scanner(System.in);

        System.out.println("Account balance is: " + balance);
        System.out.print("Enter withdraw amount: ");

        int withdrawAmount = scan.nextInt();

        try {
            if (withdrawAmount > balance) {
                int moreAmount = withdrawAmount - balance;

                // Throw custom exception
                throw new InsufficientBalanceException(
                        "Sorry, insufficient balance, you need more "
                                + moreAmount + " Rs. to perform this transaction.");
            } else {
                balance = balance - withdrawAmount;
                System.out.println("Transaction successful.");
                System.out.println("Remaining balance is: " + balance);
            }

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}