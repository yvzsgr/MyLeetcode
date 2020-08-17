package TwoPointers;

//Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice
// and return the new length.
//
//Do not allocate extra space for another array, you must do this by modifying the input
// array in-place with O(1) extra memory.

public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int [] nums){

        if(nums == null || nums.length == 0 ) return 0;
        int left = 2;
        for(int rigth = 2; rigth<nums.length; rigth++){
            if(nums[rigth-2] != nums[rigth])
                nums[left] = nums[rigth];
        }
       return left;
    }
}
