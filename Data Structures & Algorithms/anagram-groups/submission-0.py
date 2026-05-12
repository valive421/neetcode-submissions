class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = {}
        for i in strs:
            #use soreted string as index to keep track of anagram group
            #as anagram become same string after sorting
            sortedstr = "".join(sorted(i))
            if sortedstr not in res:
                res[sortedstr] = []
            res[sortedstr].append(i)
        return list(res.values())