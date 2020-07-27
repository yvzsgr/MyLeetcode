package BinarySearch;//Visual Binary Search
//          5   5                           5
//         / \ / \                         / \
//        4   4   4                       4  -∞
//       /         \                     /
//      3           3           3       3
//     /             \         / \     /
//    2               2       2   2   2
//   /                 \     /     \ /
// -∞                   1   1       1
//                       \ /
//                        0
//    0 1 2 3 4 5 6 7 8 910111213141516171819 indices
//    2,3,4,5,4,5,4,3,2,1,0,1,2,3,2,1,2,3,4,5 (20 nums)
//    l                 m                   r l=0, m=9, r=19
//    l       m         r                     l=0, m=4, r= 9
//              l   m   r                     l=5, m=7, r= 9
//              l>m r                         l=5, m=6, r= 7
//   return n[l] > n[l + 1])? l : r






public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int N = nums.length;
        if (N == 1) {
            return 0;
        }

        int left = 0, right = N - 1;
        //Binary Search
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return (left == N - 1 || nums[left] > nums[left + 1]) ? left : right;
    }


}
