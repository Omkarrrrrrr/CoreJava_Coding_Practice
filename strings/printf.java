/*The printf() method in Java is used to print formatted text directly to the console. 
It is similar to String.format(), but instead of returning a string, it outputs the formatted string to the console. */

public class printf {
    public static void main(String[] args) {
        String name = "Alice";
        int score = 95;

        // Using printf for formatted output
        System.out.printf("Student: %s, Score: %d\n", name, score); // Output: Student: Alice, Score: 95

        /*
         * format():
         * Returns the formatted string.
         * Typically used when you need to store or further manipulate the formatted
         * string.
         * 
         * 
         * printf():
         * Prints the formatted string directly to the console.
         * Used when you want to output formatted text immediately.
         */
    }

}
