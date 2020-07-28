package Easy;

public class TrailingZeros {

    public int trailingZeroes(int n) {
        int count = 0;
        while (n != 0) {
            int tmp = n / 5;
            count += tmp;
            n = tmp;
        }
        return count;
    }

    //recursive solution is only one line
    //return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
}
