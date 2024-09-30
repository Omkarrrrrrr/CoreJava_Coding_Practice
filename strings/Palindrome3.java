public class Palindrome3 {

    public static boolean ispalindrome(String str){
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start)!= str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;   // if all characters are matched
    }
    public static void main(String[] args) {
        String str = "xyzyx";

        if(ispalindrome(str)){
            System.out.println(str + " is palindrome");
        }
        else{
            System.out.println(str + " is not palindrome");
        }
    }
    
}
