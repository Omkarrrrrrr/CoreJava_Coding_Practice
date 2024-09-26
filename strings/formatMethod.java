/*The format() method in Java is used to create formatted strings, similar to printf() in C. 
  It allows you to format text with placeholders for variables and apply various formatting rules (like decimal precision, padding, alignment, etc.). */

// syntax -
/* String formattedString = String.format(String format, Object... args); */
/*format: A format string that contains the text along with placeholders (also called format specifiers) for variables.
args: The values (arguments) to replace the placeholders. */

/*
%d: Formats an integer.
%f: Formats a floating-point number.
%s: Formats a string.
%.nf: Formats a floating-point number with n decimal places.
%x: Formats an integer in hexadecimal.
%t: Formats a date/time.
 */

class formatMethod {
    public static void main(String[] args) {
        String name = "Omkar" ;
        int age = 22;
        double height = 5.11;

        //using String.format
        String formatted = String.format("Name: %s, Age: %d, Height:%1f feet" , name,age,height);
        System.out.println(formatted);

        double number = 12345.6789;
        String formatted1 = String.format("Formatted number: %.2f", number);  // Output: Formatted number: 12345.68
        System.out.println(formatted1);
       }
}