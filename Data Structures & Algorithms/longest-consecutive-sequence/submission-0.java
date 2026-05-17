class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> nset = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            nset.add(nums[i]);
        }
        int lcs = 1;
        for(int n:nset){
            if(nset.contains(n-1)){
                continue;
            }
            else{
                int currentNumber = n;
                int currentLCS = 1;
                while(nset.contains(currentNumber+1)){
                    currentNumber++;
                    currentLCS++;
                }
                lcs = Math.max(lcs,currentLCS);
            }
        }
        return lcs;
    }
}
