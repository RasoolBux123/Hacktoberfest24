import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert input to lowercase to ignore case sensitivity
        String cleanedInput = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Check if palindrome
        boolean isPalindrome = isPalindrome(cleanedInput);

        // Output result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
