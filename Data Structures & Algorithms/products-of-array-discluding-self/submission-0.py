class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        a = []
        for i in range(len(nums)):
            sum =1
            for j in range(len(nums)):
                if i != j:
                    sum *= nums[j]
            a.append(sum)
        return a