public class Question4 {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        int factor1 = 0, factor2 = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int product = i * j;

                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                    factor1 = i;
                    factor2 = j;
                }
            }
        }

        System.out.println("Largest palindrome is: " + largestPalindrome);
        System.out.println("Factors are: " + factor1 + " and " + factor2);
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }
}
