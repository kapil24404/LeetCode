class Solution {
   static class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    bfs(grid,i,j,vis);
                    count++;
                }
            }
        }
        return count;
    }
    public static void bfs(char grid[][],int s,int e,boolean vis[][]){
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(s,e));
        vis[s][e]=true;
        while(!q.isEmpty()){
            Pair a=q.poll();
            int row=a.first;
            int col=a.second;
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if (Math.abs(dx) + Math.abs(dy) != 1) continue;
                    //❌ But must filter out diagonals using Math.abs(dx) + Math.abs(dy) != 1.
//\U0001f3af The corrected code works exactly like the standard BFS and respects the 4-directional connectivity rule of the problem.

                // //antoher approach
                // int[] dr = {-1, 0, 1, 0};
                // int[] dc = {0, 1, 0, -1};

                // for (int i = 0; i < 4; i++) {
                //     int newRow = row + dr[i];
                //     int newCol = col + dc[i];
                //     // process neighbor
                // }

                    int newRow = row + dx;
                    int newCol = col + dy;
                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n &&
                    grid[newRow][newCol] == '1' && !vis[newRow][newCol]) {
                    vis[newRow][newCol] = true;
                    q.add(new Pair(newRow, newCol));
                   }
                }
            }
        }
    }
}