class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        a = []
        index = 0
        for i in nums:
            if i not in a:
                a.append(i)
            else:
                return True
            i = i+1
        return False
         