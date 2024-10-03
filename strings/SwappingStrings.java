
import java.util.Scanner;

public class SwappingStrings {
    //using temp variable
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second String: ");
        String str2 = sc.nextLine();

        //Swapping
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("Here are strings after swapping");
        System.out.println("First string: " + str1);
        System.out.println("Second String: "+str2);

       
    }
    
}
