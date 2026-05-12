class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
      numbe = {}
      for i in nums:
        count = 0
        for j in nums:
          if i == j:
            count += 1
        numbe[i] = count
      a = []
      for i in range(k):
        a.append(max(numbe, key=numbe.get))
        numbe.pop(max(numbe, key=numbe.get))
      return  a