import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = areAnagrams(str1, str2);

        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {     // first we will compare the lengths
            return false;
        }

        char[] ch1 = str1.toCharArray();         //converting strings into arrays
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);                        //sorting
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);          // comparing using equals method
    }
}
