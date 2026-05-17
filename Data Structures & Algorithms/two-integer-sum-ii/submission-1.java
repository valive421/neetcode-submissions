class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliement =  target - nums[i];
            if(map.containsKey(compliement)){
                return new int[] {map.get(compliement)+1,i+1};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}
