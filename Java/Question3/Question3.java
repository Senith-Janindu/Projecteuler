import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        long num = 600851475143L;
        ArrayList<Long> factors = new ArrayList<>();
        for (long i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                long otherFactor = num / i;
                factors.add(i);
                if (otherFactor != i) {
                    factors.add(otherFactor);
                }
            }
        }
        System.out.println("Factors: " + factors);

        for (long factor : factors) {
            if (isPrime(factor)) {
                System.out.println("Prime Factor: " + factor);
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(long n) {
        if (n <= 1)
            return false;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
