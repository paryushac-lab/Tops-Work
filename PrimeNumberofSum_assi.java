public class PrimeNumberofSum_assi {
    public static void main(String[] args) {
        int count = 0; // count of prime numbers
        int num = 2; // start from first prime
        int sum = 0;
        while (count < 100) {
            boolean isPrime = true;

            // check if number is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += num;
                count++;
            }

            num++;
        }

        System.out.println("Sum of first 100 prime numbers = " + sum);
    }
}
