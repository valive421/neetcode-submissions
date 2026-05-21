class Solution {
    public int[] dailyTemperatures(int[] tempratures) {
        int[] res = new int[tempratures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i=0;i<tempratures.length;i++){
            int t = tempratures[i];
            while(!stack.isEmpty() && t> stack.peek()[0]){
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t,i});
        }
        return res;
    }
}
