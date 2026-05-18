class Solution {
    public int trap(int[] height) {
        int l =0;
        int r = height.length-1;
        int lmax=height[0];
        int rmax = height[r];
        int result = 0;
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax = Math.max(height[l],lmax);
                result = (lmax - height[l]) + result;
            }
            else{
                r--;
                rmax = Math.max(height[r],rmax);
                result = (rmax - height[r]) + result;
            }
        }
        return result;
    }
}
