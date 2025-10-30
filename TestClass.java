// Shane Bettis
// 10/28/25
// Recursion

public class TestClass {
    public static void main (String[] args) {
        
        System.out.println(countHi("xxhixxxhixxxx"));

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
} // end class