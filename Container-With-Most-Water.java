class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxarea=Integer.MIN_VALUE;
        while(i<j){
            int area=Math.min(height[i],height[j])*(j-i);
            if(maxarea<area) maxarea=area;
            if(height[i]<height[j]) i++;
            else j--;
        }
        return maxarea;
    }
}