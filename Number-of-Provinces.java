class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 ) {
                    adj.get(i).add(j);
                }
            }
        }
        boolean vis[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                DFS(adj,i,vis);
                count++;
            }
        }
        return count;
    }
    public void DFS(ArrayList<ArrayList<Integer>> adj,int u,boolean[] vis){
            if(vis[u]) return ;
            vis[u]=true;
            for(int v:adj.get(u)){
                if(!vis[v]){
                    DFS(adj,v,vis);
                }
            }
        }
}