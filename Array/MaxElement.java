package Array;

public class MaxElement {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 6};

        // Finding the maximum element
        int max = numbers[0]; // Assume the first element is the max

        for(int i=1; i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i]; //Update max if current element is larger
            }
        }
        System.out.println("MAx element is: " + max);
    }
    
}
