import java.util.*;

public class TopKFrequentElements {


    //max heap solution
    public List<Integer> topKFrequent(int[] nums, int k) {
        //
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        //construct maxHeap
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a,b)->(b.getValue()-a.getValue())); //if we write (a,b)->(a.getValue()-b.getValue()), this becomes min heap
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        //get the list of top K frequent element from the map (which uses priority queue)
        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        return res;
    }
    //minHeap solution
//    public List<Integer> topKFrequent(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int n : nums) {
//            map.put(n, map.getOrDefault(n, 0) + 1);
//        }
//
//        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
//                new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            minHeap.add(entry);
//            if (minHeap.size() > k) minHeap.poll();
//        }
//
//        List<Integer> res = new ArrayList<>();
//        while (res.size() < k) {
//            Map.Entry<Integer, Integer> entry = minHeap.poll();
//            res.add(entry.getKey());
//        }
//        return res;
//    }

}
