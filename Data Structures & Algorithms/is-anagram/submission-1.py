class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        a = [0]*256
        for i in range(len(s)):
            a[ord(s[i])] +=1
            a[ord(t[i])] -=1
        for i in a:
            if i != 0:
                return False
        return True
