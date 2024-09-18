import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Long> fibonacci = new ArrayList<>();
        fibonacci.add(1L);
        fibonacci.add(2L);
        long evenSum = 2;

        while (true) {
            long last = fibonacci.get(fibonacci.size() - 1);
            long beforeLast = fibonacci.get(fibonacci.size() - 2);

            long nextNumber = last + beforeLast;

            if (nextNumber > 4000000) {
                break;
            }

            if (nextNumber % 2 == 0) {
                evenSum += nextNumber;
            }

            fibonacci.add(nextNumber);
        }
        
        System.out.println("Sum of even Fibonacci numbers: " + evenSum);
    }
}
