

//a sentence containing all the letters of the alphabet; esp., such a sentence in which each letter is used only once.
public class Pangram {

    public static boolean isPangram(String str){

        str = str.toLowerCase(); // Converting the string to lower case to ensure case insensitivity
        //Create a boolean array to keep track of the letters
        boolean [] alphabet = new boolean[26];
        int index = 0;

        for(char c: str.toCharArray()){
            //check if the character is the letter
            if(c >= 'a' && c <= 'z'){
                alphabet[c-'a'] = true;
            }
        }

         // Check if all letters are present
         for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        
        String str = "pack my box with five dozen liquor jugs";

        boolean result = isPangram(str);

        if(result){
            System.out.println("\"" + str + "\" is a pangram");
        }
        else{
            System.out.println("\"" + str + "\" is not a pangram.");
        }
    }
    
}
