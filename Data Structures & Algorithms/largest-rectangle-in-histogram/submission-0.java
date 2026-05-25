class Solution {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        int [] leftmost = new int[n];
        int[] rightmost = new int[n];
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for(int i=0;i<n;i++){
            leftmost[i] = -1;
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                leftmost[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
             rightmost[i] = n;
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
               rightmost[i] = stack.peek();
            }
            stack.push(i);
        }
        int maxa =0;
        for(int i=0;i<n;i++){
            leftmost[i] +=1;
            rightmost[i] -= 1;
            maxArea = Math.max(maxArea, heights[i]*(rightmost[i]-leftmost[i]+1));
        }
        return maxArea;
    }
}
