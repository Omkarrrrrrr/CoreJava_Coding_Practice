package Array;

public class SummingElements {
    public static void main(String[] args) {
         
        double numbers [] = {2.5,3.5,4.5,6.5};

        //calculating the sum of array elements
        double sum = 0;
        for(double num: numbers){
            sum = sum + num; // Add each element to the sum
        }
        System.out.println("sum of array elements: " + sum);

        //using normal for loop

        for(int i=0;i<numbers.length;i++){
            sum = sum + numbers[i];
        }

        System.out.println("sum of all elements of array is: " + sum);
    }
    
}
