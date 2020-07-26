public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int headrunner = 0;
        if(nums.length == 0) return 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!= val){
                nums[headrunner] = nums[i];
                headrunner++;
            }
        }
        return headrunner;
    }
}
