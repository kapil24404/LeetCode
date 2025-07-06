class Solution {
    public int largestRectangleArea(int[] heights) {
         Stack<Integer> st=new Stack<>();
         int n=heights.length;
         int nsr[]=new int[n];
         int nsl[]=new int[n];
         st.push(n-1);
         nsr[n-1]=n;
         for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            nsr[i]=st.isEmpty()?n:st.peek();
            st.push(i);
         }
         st.clear(); 
         st.push(0);
         nsl[0]=-1;
         for(int i=1;i<n;i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            nsl[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
         }
         int currArea=0;
         for(int i=0;i<n;i++){
            int currht=nsr[i]-nsl[i]-1;
            int curr=currht*heights[i];
            currArea=Math.max(currArea,curr);
         }
         return currArea;
    }
}