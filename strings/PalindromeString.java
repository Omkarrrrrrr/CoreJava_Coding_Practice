public class PalindromeString {
    // Method to check if a string is palindrome using StringBuilder
    public static boolean ispalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString(); // Reverse the string
        return str.equals(reversed); // Check if original equals reversed string

    }

    public static void main(String[] args) {
        // Using StringBuilder
        String str = "madam";

        // Check if the string is palindrome
        if (ispalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
