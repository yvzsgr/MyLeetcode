package Interview;

//[25,35,278, 872, 53, 872, 278]
//Output 4
//220 and 22 is not anagram


import java.util.HashMap;

public class DigitSumPairs {
    public int getDigitSumPairs(int[] a) {
        int result = 0;
        //HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {


            }
        }

        return result;
    }

}

//    int digitSum(int a) {
//        int sum = 0;
//
//        while (a != 0) {
//            sum = sum + a % 10;
//            a = a / 10;
//        }
//        return sum;
//    }

//    static final int TEN = 10;

// Function to update the frequency array
// such that freq[i] stores the
// frequency of digit i in n
//    static void updateFreq(int n, int [] freq)
//    {

// While there are digits
// left to process
//        while (n > 0)
//        {
//            int digit = n % TEN;

// Update the frequency of
// the current digit
//            freq[digit]++;

// Remove the last digit
//            n /= TEN;
//        }
//    }

// Function that returns true if a and b
// are anagarams of each other
//    boolean areAnagrams(int a, int b)
//    {

// To store the frequencies of
// the digits in a and b
//        int [] freqA = new int[TEN];
//        int [] freqB = new int[TEN];

// Update the frequency of
// the digits in a
//        updateFreq(a, freqA);

// Update the frequency of
// the digits in b
//        updateFreq(b, freqB);

// Match the frequencies of
// the common digits
//        for (int i = 0; i < TEN; i++)
//        {

// If frequency differs for any digit
// then the numbers are not
// anagrams of each other
//            if (freqA[i] != freqB[i])
//                return false;
//        }
//        return true;

//}
