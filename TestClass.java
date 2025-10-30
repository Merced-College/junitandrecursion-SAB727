// Shane Bettis
// 10/28/25
// Recursion

public class TestClass {
    public static void main (String[] args) {
        
        System.out.println("Count of hi's: " + countHi("xxhixxxhixxxx"));
        System.out.println("Count of hi's (no x before): " + countHi2("xhixhix"));
        System.out.println("Count of 8's (if next to each other then double): " + count8(8818));
        System.out.println("Count of cats in str: " + strCount("catcowcat", "cat"));
        System.out.println("Count of cows in str: " + strCount("catcowcat", "cow"));
        System.out.println("Count of dogs in str: " + strCount("catcowcat", "dog"));
        System.out.println("String cleaned: " + stringClean("yyzzza"));
        System.out.println("String cleaned: " + stringClean("abbbcdd"));
        System.out.println("String cleaned: " + stringClean("Hello"));

    } // end main

    public static int countHi(String str) {
        System.out.println(str);

        // check for null string
        if (str == null)
            return 0;
        
        // base case
        if (str.length() <= 1)
            return 0;

        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);
        if (firstLetter == 'h' && secondLetter == 'i')
            return 1 + countHi(str.substring(2));

        return countHi(str.substring(1));
    } // end method

    public static int countHi2(String str) {
        // check for null string
        if (str == null)
            return 0;
        
        // base case
        if (str.length() <= 1)
            return 0;
        // if x is before hi, skip hi
        if (str.startsWith("xhi"))
            return countHi2(str.substring(3));
        // if hi found, count it and move past it
        if (str.startsWith("hi"))
            return 1 + countHi2(str.substring(2));

        return countHi2(str.substring(1));
    } // end method

    public static int count8(int n) {
        // base case
        if (n == 0)
            return 0;

        int lastDigit = n % 10;
        int secondLastDigit = (n / 10) % 10;

        if (lastDigit == 8) {
            if (secondLastDigit == 8)
                return 2 + count8(n / 10);
            else
                return 1 + count8(n / 10);
        } else {
            return count8(n / 10);
        }
    } // end method

    public static int strCount(String str, String sub) {
        // check for null string
        if (str == null || sub == null)
            return 0;
        
        // base case
        if (str.length() < sub.length())
            return 0;

        if (str.startsWith(sub))
            return 1 + strCount(str.substring(sub.length()), sub);

        return strCount(str.substring(1), sub);
    } // end method

    public static String stringClean(String str) {
        // check for null string
        if (str == null)
            return null;
        
        // base case
        if (str.length() <= 1)
            return str;

        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);

        if (firstLetter == secondLetter)
            return stringClean(str.substring(1));

        return firstLetter + stringClean(str.substring(1));
    } // end method
} // end class