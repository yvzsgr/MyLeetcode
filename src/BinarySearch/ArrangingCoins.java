package BinarySearch;

//You have a total of n coins that you want to form in a staircase shape,
//where every k-th row must have exactly k coins.
//Given n, find the total number of full staircase rows that can be formed.
//n is a non-negative integer and fits within the range of a 32-bit signed integer.




public class ArrangingCoins {

    public int arrangeCoins(int n) {
        long left = 0, right = n;
        long k, curr;
        while (left <= right) {
            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;

            if (curr == n) return (int)k;

            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return (int)right;
    }
}
