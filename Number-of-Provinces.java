class Solution {
    int n;
    public int findCircleNum(int[][] isConnected) {
         n = isConnected.length;
        //ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        //     adj.add(new ArrayList<>());
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (isConnected[i][j] == 1) {
        //             adj.get(i).add(j);
        //         }
        //     }
        // }
        boolean[] vis = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                BFS(isConnected, i, vis);
                count++;
            }
        }
        return count;
    }

    public void BFS(int[][] isConnected, int u, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        vis[u] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int v=0;v<n;v++) {
                if (!vis[v] && isConnected[curr][v]==1) {
                    vis[v] = true;
                    q.add(v);
                }
            }
        }
    }
}

    // public void DFS(ArrayList<ArrayList<Integer>> adj,int u,boolean[] vis){
    //         if(vis[u]) return ;
    //         vis[u]=true;
    //         for(int v:adj.get(u)){
    //             if(!vis[v]){
    //                 DFS(adj,v,vis);
    //             }
    //         }
    //     }
  