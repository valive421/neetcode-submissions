class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = nums
        result = []
        for i in range(len(n)-2):
            if i > 0 and nums[i] == nums[i - 1]:  # Skip duplicates
                continue
            l =i+1
            r= len(n)-1
            while l<r:
              total = n[i]+n[l]+n[r]
              if total == 0 and (i!=l and l != r):
                result.append([n[i],n[l],n[r]])
                while l < r and nums[l] == nums[l + 1]:  
                        l += 1
                while l < r and nums[r] == nums[r - 1]:  
                        r -= 1
                l += 1
                r -= 1
              elif total < 0 :
                l += 1
              else :
                r -=1
        return result
