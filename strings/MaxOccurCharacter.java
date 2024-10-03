public class MaxOccurCharacter {

    public static char getMaxOccuringChar(String str){
        //Array to store frequency of each character (Assuming ASCII characters)
        int [] charCount = new int[256] ;//Assuming ascii char set

        for(char c:str.toCharArray()){
            charCount[c]++;
        }

        char maxChar = ' ';   //This variable will hold the character with highest frequency
        int maxCount = 0;     //Stores highest frequency found so far

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }
        return maxChar;

    }
    public static void main(String[] args) {
        
        String input = "Assistant";
        char maxChar = getMaxOccuringChar(input);
        System.out.println("The maximum occuring character in\"" +input+ "\" is: " + maxChar);
    }
}
