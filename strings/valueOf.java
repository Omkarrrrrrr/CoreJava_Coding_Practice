public class valueOf {
    public static void main(String[] args) {
        String numberString = "456";

        // Convert string to Integer object using valueOf
        Integer number = Integer.valueOf(numberString);
        System.out.println("The converted Integer object is: " + number); // Output: The converted Integer object is:
                                                                          // 456
    }
}

/*
 * 3. Difference Between parseInt() and valueOf()
 * Aspect                           parseInt()                                                         valueOf()
 * Return Type                       Returns a primitive int.                        Returns an Integer object (wrapper class).
 * Usage                        Used for converting a String to a primitive int.          Used for converting a String to an Integer object.
 * Example                              int num = Integer.parseInt("123");                 Integer num =Integer.valueOf("123");
 * Performance                      Generally faster because it returns a primitive.     Slightly slower due to boxing overhead (creating an Integer object).
 * Null              Handling Throws NumberFormatException if the string is not a            Returns null if the string is null
                                                    valid  number.*/