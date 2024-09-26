
/*
 In Java, the String Pool (also known as the String Intern Pool) is a special memory region inside the Java Heap where String literals are stored. 
 The purpose of this pool is to save memory by reusing instances of Strings with the same value, rather than creating multiple copies of the same String object.*/


/* When a String is created using a String literal, Java checks if an equivalent String already exists in the pool.
If the String already exists, the reference to the existing String is returned.
If not, the new String is added to the pool. This process is called String interning. This can be done by intern() method */


public class StringPool {
    public static void main(String[] args) {
        // example 1 
        String str1 = "Hello";  // String literal
        String str2 = "Hello";  // Reuses the same String from the pool
        
        System.out.println(str1 == str2);  // Output: true (Same reference in the pool)   


        //example 2

        String str3 = new String("Java");  // Creates a new String object
        String str4 = "Java";  // Reuses the String from the pool
        
        System.out.println(str3 == str4);  // Output: false (Different objects)
        System.out.println(str3.equals(str4));  // Output: true (Same content)

        // example 3 - intern() method
        String str5 = new String("Hello");
        String str6 = "Hello";
        
        str5 = str5.intern();  // Manually intern the String
        
        System.out.println(str5 == str6);  // Output: true (Now both point to the same object in the pool)
        
    }
   
}

/*When you create a String using the new keyword, it does not use the String pool by default. Instead, it creates a new String object on the heap. */

