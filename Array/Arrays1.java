package Array;
import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        // Declaration and Initialization
        int[] arr = { 5, 3, 8, 1, 9 };

        // Accessing elements
        System.out.println("Element at index 2: " + arr[2]);

        // Traversing the array
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //sorting the array
        Arrays.sort(arr);
        System.out.println("sorted Array: "+ Arrays.toString(arr));

         // Searching for an element
         int index = Arrays.binarySearch(arr, 8);
         System.out.println("Index of 8: " + index);

    }

}
