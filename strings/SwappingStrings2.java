import java.util.Scanner;
public class SwappingStrings2 {
    //Swapping without using third variable
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second String: ");
        String str2 = sc.nextLine();

        //Swapping without using temp variable

        str1 = str1+str2; //Now the str1 contains both the strings
        str2 = str1.substring(0, str1.length()-str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("Here are strings after swapping");
        System.out.println("First string: " + str1);
        System.out.println("Second String: "+str2);
    }
    
}
