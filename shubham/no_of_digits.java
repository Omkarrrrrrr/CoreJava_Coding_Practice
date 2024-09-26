package shubham;

import java.util.*;

public class no_of_digits {
    public static void main(String[] args) {

        // 1234567= 28
        // 2357125 = 25

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while (n > 0) {
            
            n = n/10;
            count++;

            

        }
        System.out.println("The sum of all the digits is : " + count);

    }

}
