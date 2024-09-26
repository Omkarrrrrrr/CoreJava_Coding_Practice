public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        
        // Append text
        sb.append(" Programming");
        System.out.println(sb);  // Output: Java Programming
        
        // Insert text at index 5
        sb.insert(5, "is Fun ");
        System.out.println(sb);  // Output: Java is Fun Programming
        
        // Replace text from index 5 to 12
        sb.replace(5, 12, "was");
        System.out.println(sb);  // Output: Java was Programming
        
        // Delete characters from index 5 to 9
        sb.delete(5, 9);
        System.out.println(sb);  // Output: Java Programming
        
        // Reverse the string
        sb.reverse();
        System.out.println(sb);  // Output: gnimmargorP avaJ
    }
    
}
