package Array;

public class ReversalArray {
    public static void main(String[] args) {
         int arr [] = {45,65,78,34,777};

         int n = arr.length;

         for(int i=0; i<n/2;i++){
            //swapping the elements between array[i] and arr[n-i-1]
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        System.out.println("REversal of an array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]); //printing reversed array
            System.out.print(" ");//For space between values 
        }
    }
    
}

//tc = O(n)
//sc = O(1)