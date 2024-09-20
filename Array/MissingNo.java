package Array;

// these no. will be contiguous
public class MissingNo {
    public static void main(String[] args) {

        int arr[] = new int[6];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 6;
        arr[5] = 7; // To print the array we have to iterate using for loop

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int n = arr.length + 1; // +1 because we are considering missing element also

        // Calculate the expected sum of numbers from 1 to n (sum of first n )
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the array
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }
            // The missing number is the difference between the expected sum and the actual
            // sum
            int missingNumber = expectedSum - actualSum;

            System.out.println("The missing number is: " + missingNumber);
        }

    }


