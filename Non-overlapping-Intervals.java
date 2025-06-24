class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingDouble(o ->o[1]));
        int count=0;
        int lastind=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<lastind){
                count++;
            }
            else{
                lastind=intervals[i][1];
            }
        }
        return count;
    }
}