public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        // Append text
        sb.append(" Programming");
        System.out.println(sb); // Output: Java Programming

        // Insert text at index 5
        sb.insert(5, "is Fun ");
        System.out.println(sb); // Output: Java is Fun Programming

        // Replace text from index 5 to 12
        sb.replace(5, 12, "was");
        System.out.println(sb); // Output: Java was Programming

        // Delete characters from index 5 to 9
        sb.delete(5, 9);
        System.out.println(sb); // Output: Java Programming

        // Reverse the string
        sb.reverse();
        System.out.println(sb); // Output: gnimmargorP avaJ

        /*
         * String: Use when the value is constant and won’t change or when performing
         * simple string operations.
         * 
         * Example: Storing constant strings like "Hello", "World", etc.
         * StringBuffer: Use when you need to modify a string in a multithreaded
         * environment.
         * 
         * Example: Accumulating or modifying strings in a web server where multiple
         * threads access the same object.
         * StringBuilder: Use when you need to modify a string in a single-threaded
         * environment (most common scenario).
         * 
         * Example: Concatenating or building strings in loops, dynamic string
         * generation.
         */
    }

}
