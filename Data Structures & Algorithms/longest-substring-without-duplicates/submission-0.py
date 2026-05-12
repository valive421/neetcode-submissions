class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_len =0
        st=set()
        l =0
        for i in range(len(s)):
            while(s[i] in st):
                st.remove(s[l])
                l+=1
            st.add(s[i])
            max_len = max(max_len,i-l+1)
        return max_len