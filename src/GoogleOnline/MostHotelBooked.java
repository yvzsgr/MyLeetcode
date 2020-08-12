package GoogleOnline;

//    Given a hotel which has 10 floors [0-9] and each floor has 26 rooms [A-Z]. You are given a sequence of rooms, where + suggests room is booked, - room is freed. You have to find which room is booked maximum number of times.
//
//    You may assume that the list describe a correct sequence of bookings in chronological order; that is, only free rooms can be booked and only booked rooms can be freeed. All rooms are initially free. Note that this does not mean that all rooms have to be free at the end. In case, 2 rooms have been booked the same number of times, return the lexographically smaller room.
//
//    You may assume:
//
//    N (length of input) is an integer within the range [1, 600]
//    each element of array A is a string consisting of three characters: "+" or "-"; a digit "0"-"9"; and uppercase English letter "A" - "Z"
//    the sequence is correct. That is every booked room was previously free and every freed room was previously booked.


public class MostHotelBooked {


    public static String solution(String[] floors)
    {
        int[] map = new int[260];
        int max = 0;
        String currentMax = floors[0];

        for (int i = 0; i < floors.length; i++)
        {
            String currentRoom = floors[i];
            if (currentRoom.charAt(0) == '-') continue;
            int idx = (1 + currentRoom.charAt(1) - '0') * (1 + currentRoom.charAt(2) - 'A') - 1;
            map[idx]++;
            if (map[idx] > max)
            {
                max = map[idx];
                currentMax = currentRoom;
            }
            else if (map[idx] == max)
            {
                currentMax = currentMax.compareTo(currentRoom) < 0 ? currentMax : currentRoom;
            }
        }

        return currentMax.substring(1);
    }


}
