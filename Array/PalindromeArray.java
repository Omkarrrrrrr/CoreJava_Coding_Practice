package Array;

public class PalindromeArray {

    public static void main(String[] args) {
        
        int [] arr1 = {1,3,5,3,1};
        int n = arr1.length;

        int flag = 0;

        for(int i=0; i<n/2; i++){
            if(arr1[i]!=arr1[n-i-1]){
                flag = 1;
                System.out.println("Not a palindromic array");
                break;
            }
        }

        if (flag==0){
            System.out.println("Palindromic array");

        }
    }
    
}
