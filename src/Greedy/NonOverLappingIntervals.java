package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverLappingIntervals {

    public int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals.length == 0)  return 0;

        Arrays.sort(intervals, new myComparator());
        int end = intervals[0].end;
        int count = 1;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= end) {
                end = intervals[i].end;
                count++;
            }
        }
        return intervals.length - count;
    }

    class myComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.end - b.end;
        }
    }

    static class Interval {
        int start;
        int end;
        Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    //updated leetcode question
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int end = intervals[0][1];
        int count = 1;

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= end){
                end = intervals[i][1];
                count++;
            }
        }

        return intervals.length - count;
    }
}

