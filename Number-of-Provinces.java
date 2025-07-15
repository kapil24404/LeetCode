class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }
        boolean vis[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                BFS(adj,i,vis);
                count++;
            }
        }
        return count;
    }
    // public static void DFS(ArrayList<ArrayList<Integer>> adj,int u,boolean vis[]){
    //     vis[u]=true;
    //     for(int v:adj.get(u)){
    //         if(!vis[v]){
    //             DFS(adj,v,vis);
    //         }
    //     }
    // }

    public static void BFS(ArrayList<ArrayList<Integer>> adj,int u,boolean vis[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(u);
        vis[u]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int v:adj.get(curr)){
                if(!vis[v]){
                    q.add(v);
                    vis[v]=true;
                }
            }
        }
    }
}