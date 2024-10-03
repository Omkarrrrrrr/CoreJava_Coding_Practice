import java.util.*;

public class CountVCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine(); // Read user input
        countCharacters(str1); // Pass the string to the method
    }

    public static void countCharacters(String str1) {
        int vowels = 0, consonants = 0, specials = 0;

        str1 = str1.toLowerCase(); // Convert to lowercase for easier comparison

        for (int i = 0; i < str1.length(); i++) { // Iterate through each character
            char ch = str1.charAt(i); // Get the character at the current index

            if (ch >= 'a' && ch <= 'z') { // Check if the character is a letter
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++; // It's a consonant if it's not a vowel
                }
            } else if (ch != ' ') {
                specials++; // Increment specials for any character that is not a space
            }
        }

        System.out.println("No of vowels: " + vowels);
        System.out.println("No of consonants: " + consonants);
        System.out.println("No of special characters: " + specials);
    }
}
