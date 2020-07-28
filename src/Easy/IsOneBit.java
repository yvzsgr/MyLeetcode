package Easy;

public class IsOneBit {
    public boolean isOneBitCharacter(int[] bits) {
        int count = 0;
        while (count < bits.length - 1) {
            count += bits[count] + 1;
        }
        return count == bits.length - 1;
    }

}
