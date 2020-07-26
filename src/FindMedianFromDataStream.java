import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedianFromDataStream {

    /** initialize your data structure here. */
    private Queue<Integer> small = new PriorityQueue(Collections.reverseOrder());
    private Queue<Integer> large = new PriorityQueue();

    // Adds a number into the data structure.
    public void addNum(int num) {
        large.add(num);
        small.add(large.poll());
        if (large.size() < small.size())
            large.add(small.poll());
    }

    // Returns the median of current data stream
    public double findMedian() {
        return large.size() > small.size()
                ? large.peek()
                : (large.peek() + small.peek()) / 2.0;
    }



}
