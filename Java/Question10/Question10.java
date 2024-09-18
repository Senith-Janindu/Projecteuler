package Java.Question10;

public class Question10 {
    public static void main(String[] args) {
        long sum = 2;  

        for (int n = 3; n < 2000000; n += 2) {
            boolean isPrime = true;

            
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false; 
                    break;
                }
            }

            if (isPrime) {
                sum += n;  
            }
        }

        System.out.println("Sum of all primes below 2,000,000: " + sum);
    }
}
