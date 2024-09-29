import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {

        String str = "Hello";
        // length - returns the no of characters in string

        int len = str.length();
        System.out.println(len);

        // charAt( int index) - returns character at specified index

        char ch = str.charAt(2);
        System.out.println(ch);

        // substring (int beginIndex , int endindex)

        String sub = str.substring(2, 5); // here it will return char at index 2 3 4 begin - inclusive
        System.out.println(sub); // will not consider 5th index end - exclusive

        // concat( String str ) concatenates the specified string to end of the current
        // string

        String str1 = "Java";
        String str2 = "Practice";
        String concatenated = str1.concat(str2);
        System.out.println(concatenated);

        // contains(charSequence s) checks if the string contains the specified sequence
        // of characters

        boolean contains = str.contains("Hello");
        System.out.println(contains);

        /*
         * equals vr == operator
         * equals() checks if two strings have the same value.
         * == checks if two references point to the same object.
         */

        String str3 = new String("Omkar");
        String str4 = "Omkar";
        boolean isEqual = str3.equals(str4);
        boolean isSame = (str3 == str4);

        System.out.print(isEqual);
        System.out.println(isSame);
        /*
         * str1 is created using the new keyword, so it creates a new object in the heap
         * memory.
         * str2 is created using a string literal, so it is stored in the string pool.
         * Since str1 and str2 refer to different memory locations, == returns false.
         */

        // equalsIgnoreCase(String anotherString) - compares two strings , ignoring case
        // differences

        String str5 = "Hello";
        String str6 = "hello";
        boolean isequal = str5.equalsIgnoreCase(str6);
        System.out.println(isequal);

        /*
         * compareTo(String anotherString) compares two strings lexicographically.
         * compareToIgnoreCase(String anotherString) compares two strings
         * lexicographically, ignoring case.
         */

        String str7 = "Apple";
        String str8 = "Banana";
        int result = str7.compareTo(str8); // this will give negative value
        int resultIgnoreCase = str7.compareToIgnoreCase("apple"); // output will be 0
        System.out.println(result);
        System.out.println(resultIgnoreCase);

        /*
         * Here, compareTo() returns a negative value because "apple" comes before
         * "banana" lexicographically (like in a dictionary).
         * "a" is compared to "b", and since "a" has a smaller Unicode value than "b",
         * "apple" is considered smaller.
         * If two strings are identical, compareTo() returns 0.
         * If a string is lexicographically greater, it returns a positive value.
         */

        /*
         * This method compares the strings ignoring case. So, "Apple" and "apple" are
         * considered equal because case doesn't matter here.
         * Since both strings are considered equal lexicographically when ignoring case,
         * the result is 0.
         * So, resultIgnoreCase = 0
         */

        // isEmpty() checks if the string is empty (length is 0)
        String str9 = "";
        boolean empty = str9.isEmpty();
        System.out.println(empty);

        // indexOf(int ch) - returns index of the first occurence of specified character
        // lastIndexOf(int ch) - returns the index of the last occurrence of the
        // specified character

        String str10 = "Hello World";
        int firstIndex = str10.indexOf('o'); // Output: 4
        int lastIndex = str10.lastIndexOf('o'); // Output: 7
        System.out.println(firstIndex);
        System.out.println(lastIndex);

        /*
         * startsWith(String prefix) and endsWith(String suffix)
         * startsWith() checks if the string starts with the specified prefix.
         * endsWith() checks if the string ends with the specified suffix.
         */

        String str11 = "StringsPractice";
        boolean starts = str11.startsWith("Strings");
        boolean ends = str11.endsWith("Practice");
        System.out.println(starts);
        System.out.println(ends);

        // trim() - removes leading and trailing whitespaces from the string

        String str12 = "     Omkar       ";
        String trimmed = str12.trim();
        System.out.println(trimmed);

        // replace (char oldChar , char newChar) - replaces all occurrences of oldChar
        // with newChar
        // replaceAll() replaces all occurrences matching the regular expression regex.

        String replacedChar = str.replace('l', 'p'); // Output: "Heppo"
        String replacedAll = "123abc".replaceAll("\\d", ""); // Output: "abc"

        System.out.println(replacedChar);
        System.out.println(replacedAll);
        /*
         * \\d is a regular expression that matches any digit (0-9). The \\d is used
         * because Java requires an extra backslash to escape the special meaning of \d
         * (single \d is a regex for digit).
         * The replacement string "" (empty string) means that the digits found will be
         * removed from the string.
         */

        /*
         * List of Regex Patterns Used
         * \\s+: Matches one or more whitespace characters.
         * \\d: Matches any digit (0-9).
         * <[^>]*>: Matches any HTML tag.
         * [!?.()]: Matches specified special characters.
         * [^a-zA-Z0-9]: Matches any character that is not a letter or digit.
         * (\\w+) (\\w+): Captures two words separated by a space.
         * [0-9]: Matches any digit.
         * \\p{Punct}: Matches any punctuation character.
         * \\d(?=\\d{4}): Matches any digit followed by exactly four digits.
         * (.)\\1+: Matches any character followed by itself one or more times.
         * (\\d{4})-(\\d{2})-(\\d{2}): Captures a date in the format YYYY-MM-DD.
         * ^\\s+|\\s+$: Matches leading and trailing whitespace characters.
         * \\W+: Matches one or more non-word characters.
         */

        // split(String regex) splits the string around matches of the given regular
        // expression


        // ex 1 - replace all
        String str14 = "My phone number is 123-456-7890.";
        
        // Replace all digits with '*'
        String replaced = str14.replaceAll("[0-9]", "*");
        
        System.out.println("Original String: " + str);
        System.out.println("Replaced String: " + replaced);  // Output: My phone number is ***-***-****.

        // ex2 - replace all
        String str15 = "This is a test string.\nIt has multiple lines and    spaces.";
        
        // Replace all whitespace characters with '_'
        String replaced1 = str15.replaceAll("\\s+", "_");
        
        System.out.println("Original String: ");
        System.out.println(str);
        System.out.println("\nReplaced String: " + replaced);


        // ex of split
        String str13 = "a,b,c";
        String[] arr = str13.split(",");
        System.out.println(Arrays.toString(arr));

        String sentence = "Java is a versatile programming language.";
        String[] words = sentence.split(" "); // Split by space
        System.out.println(Arrays.toString(words)); // Output: [Java, is, a, versatile, programming, language.]

        String data = "apple;banana,grape|orange";
        String[] fruits = data.split("[;|,]"); // Split by semicolon, comma, or pipe
        System.out.println(Arrays.toString(fruits)); // Output: [apple, banana, grape, orange]

        // .toUpperCase and .toLowerCase
        String lower = str.toLowerCase(); // Output: "hello"
        String upper = str.toUpperCase(); // Output: "HELLO"
        System.out.println(lower);
        System.out.println(upper);
    }

}
