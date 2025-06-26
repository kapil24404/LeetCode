class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int lastind=pairs[0][1];
        int ans=1;
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastind){
                ans+=1;
                lastind=pairs[i][1];
            }
        }
        return ans;
    }
}