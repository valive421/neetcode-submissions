class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int l =0;
        HashSet<Character> sub = new HashSet<> ();
        for(int i=0;i<s.length();i++){
            while(sub.contains(s.charAt(i))){
                sub.remove(s.charAt(l));
                l++;
            }
            sub.add(s.charAt(i));
            maxLen = Math.max(maxLen,i-l+1);
        }
        return maxLen;
    }
}
