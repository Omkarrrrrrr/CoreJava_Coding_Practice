public class ReversalString {

    public static void main(String[] args) {
        // Using stringbuilder
        String str1 = new String("Java");
        StringBuilder sb = new StringBuilder(str1);
        String reversed1 = sb.reverse().toString(); //toString() method converts the StringBuilder (which is mutable) back into a String (which is immutable).
        System.out.println("Reversed string: " + reversed1);  //calling toString() returns the reversed string as a regular String object.


        // Using for loop
        String str2 = "Practice";
        String reversed2 = "";

        for(int i= str2.length()-1; i>=0; i--){
            reversed2 = reversed2 + str2.charAt(i);
        }
        System.out.println("Reversed string is : " + reversed2);

    }

}
