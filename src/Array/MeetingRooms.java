package Array;

import java.util.Arrays;

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }

}


public class MeetingRooms {

    public boolean canAttendMeetings(Interval[] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        for (int i = 0; i < starts.length; i++) {

            if (starts[i + 1] < ends[i]) {
                return false;
            }

        }
        return true;
    }


}
