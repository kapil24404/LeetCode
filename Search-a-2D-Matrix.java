class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
           if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int start=0;
        int end=m*n-1;
        while(start<=end){
            int mid=end+(start-end)/2;
            int midvalue=matrix[mid/n][mid%n];
            if(midvalue==target){
                return true;
            }
            else if(midvalue<target){
                start=mid+1;
                
            }
            else{
               end=mid-1; 
            }
        }
        return false;
    }
}