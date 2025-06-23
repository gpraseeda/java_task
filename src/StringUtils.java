public class StringUtils {

    // Method to reverse a string using StringBuilder
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed); // case-insensitive check
    }

    public static void main(String[] args) {
        String str = "Madam";

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverseString(str));
        System.out.println("Is Palindrome: " + isPalindrome(str));
    }
}
