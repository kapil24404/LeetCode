class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int ans[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                hm.put(grid[i][j],hm.getOrDefault(grid[i][j],0)+1);
            }
        }
        for (int i = 1; i <= n * n; i++) {
        int count = hm.getOrDefault(i, 0);
        if (count == 2) ans[0] = i;   
        if (count == 0) ans[1] = i;     
    }
        return ans;
    }
}