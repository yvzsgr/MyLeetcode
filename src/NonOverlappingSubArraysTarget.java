import java.util.HashMap;

public class NonOverlappingSubArraysTarget {


    //Solution
    //Concept: First traverse through the array once and store the (key,value) pair as (sum(arr[0:i+1]),i)
    // for 0<=i<size of arr. Put, (0,-1) in hashmap as default.
    // Now traverse through the array again, and for every i, find the minimum value of length of sub-array on
    // the left or starting with i whose value is equal to target.
    // Find another sub-array starting with i+1, whose sum is target.
    // Update the result with the minimum value of the sum of both the sub-array.
    // This is possible because all values are positive and the value of sum is strictly increasing.


    public int minSumOfLengths(int[] arr, int target) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int sum=0,lsize=Integer.MAX_VALUE,result=Integer.MAX_VALUE;
        hmap.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            hmap.put(sum,i); // stores key as sum upto index i, and value as i.
        }
        sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hmap.get(sum-target)!=null){
                lsize=Math.min(lsize,i-hmap.get(sum-target));      // stores minimum length of sub-array ending with index<= i with sum target. This ensures non- overlapping property.
            }
            //hmap.get(sum+target) searches for any sub-array starting with index i+1 with sum target.
            if(hmap.get(sum+target)!=null&&lsize<Integer.MAX_VALUE){
                result=Math.min(result,hmap.get(sum+target)-i+lsize); // updates the result only if both left and right sub-array exists.
            }
        }
        return result==Integer.MAX_VALUE?-1:result;
    }



    //this one is the sliding window solution
//    int n = arr.length;
//    int best[] = new int[n];
//       Arrays.fill(best, Integer.MAX_VALUE);
//    int sum = 0, start = 0, ans = Integer.MAX_VALUE, bestSoFar = Integer.MAX_VALUE;
//       for(int i = 0; i < n; i++){
//        sum += arr[i];
//        while(sum > target){
//            sum -= arr[start];
//            start++;
//        }
//        if(sum == target){
//            if(start > 0 && best[start - 1] != Integer.MAX_VALUE){
//                ans = min(ans, best[start - 1] + i - start + 1);
//            }
//            bestSoFar = min(bestSoFar, i - start + 1);
//        }
//        best[i] = bestSoFar;
//    }
//       return ans == Integer.MAX_VALUE ? -1 : ans;

}
