import java.util.List;
import java.util.ArrayList;

public class Main {
    // Method to reverse a given string
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }

    // Method to generate the first n prime numbers
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int candidate = 2;
        while (primes.size() < n) {
            if (isPrime(candidate)) {
                primes.add(candidate);
            }
            candidate++;
        }
        return primes;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method to demonstrate the usage of the above methods
    public static void main(String[] args) {
        // Test reverseString
        String original = "Hello";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // Test isPalindrome
        String palindrome = "anna";
        String nonPalindrome = "hello";
        System.out.println(palindrome + " is a palindrome: " + isPalindrome(palindrome));
        System.out.println(nonPalindrome + " is a palindrome: " + isPalindrome(nonPalindrome));

        // Test generatePrimes
        int n = 10;
        List<Integer> primes = generatePrimes(n);
        System.out.println("First " + n + " primes: " + primes);
    }
}
