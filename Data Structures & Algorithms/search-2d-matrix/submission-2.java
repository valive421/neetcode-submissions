class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top =0;
        int bot = rows-1;

        while(top<=bot){
            int r = (top+bot) /2;
            if(target > matrix[r][cols-1]) top = r +1;
            else if(target < matrix[r][0]) bot = r-1;
            else {top =r ;break;} 
        }
         if (!(top <= bot)) {
            return false;
        }
        int row = (top+bot) / 2;
        int l =0; int r = cols-1;
        while(l<=r){
            int m = (l+r) /2;
            if(matrix[row][m]==target) return true;
            else if (matrix[row][m]> target) r = m-1;
            else l = m+1;
        }
        return false;
    }
}
