class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0){
            return new int[] {};
        }
        Map<Integer,Integer> freq = new HashMap<>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> freq.get(a) - freq.get(b)
        );
         for(int n:freq.keySet()){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
         }
         int [] ans = new int[k];
         for(int i=0;i<k;i++){
            ans[i] = heap.poll();
         }
         return ans;
    }
}
