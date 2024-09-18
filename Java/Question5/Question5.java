import java.math.BigInteger;

public class Question5 {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        BigInteger lcm = BigInteger.ONE;
        for (int num : numbers) {
            lcm = lcm(lcm, BigInteger.valueOf(num));
        }

        System.out.println("The LCM of the 20 numbers is: " + lcm);
    }

    public static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(a.gcd(b));
    }
}
