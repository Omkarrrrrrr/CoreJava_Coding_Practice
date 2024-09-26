package shubham;

public class Palindrome {
    public static void main(String[] args) {
        
        String str1 = "abcba";
        String str2 = "";

        int n = str1.length();

        for(int i=n-1;i>=0;i--){
            str2 = str2+ str1.charAt(i);
        }

        if(str1.equals(str2)){
            System.out.println("The word is palindrome ");
        }
        else{
            System.out.println("the word is not palindrome");
        }
    }
    
}
