public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        // Initialize variables to store sum of ASCII codes for
        // each string
        int charCodeS = 0, charCodeT = 0;
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) charCodeS += (int)s.charAt(i);
        for (int i = 0; i < t.length(); ++i) charCodeT += (int)t.charAt(i);
        // Return the difference between 2 strings as char
        return (char)(charCodeT - charCodeS);
    }

//Bit Manipulation Solution
//    public char findTheDifference(String s, String t) {
//        int n = t.length();
//        char c = t.charAt(n - 1);
//        for (int i = 0; i < n - 1; ++i) {
//            c ^= s.charAt(i);
//            c ^= t.charAt(i);
//        }
//        return c;
//    }

}