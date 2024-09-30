// here we will be checking if the given string is palindrome or not by using char[] array

public class Palindrome2 {

    public static boolean ispalindrome(String str){
        char[] ch = str.toCharArray();   //converted string to char array
        int start = 0;
        int end = ch.length-1;


        while(start < end){
            if (ch[start]!= ch[end]){
                return false;      // if mismatch its not palindrome
            }

            start++;
            end--;
        }
        return true;   // if all characters match, its palindrome

    }
    public static void main(String[] args) {
        String str = "abcba";
        if (ispalindrome(str)){
            System.out.println(str + " is palindrome");
        }
        else{
            System.out.println(str+ " is not palindrome");
        }
    }
}
