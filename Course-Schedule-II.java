class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
       ArrayList<Integer> res=new ArrayList<>();
       boolean hasCycle=isCyclic(numCourses,prerequisites,res);
       if (hasCycle) return new int[0];
       int[] order = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            order[i] = res.get(i);
        }
        return order;
    }
     public boolean isCyclic(int V, int[][] edges,ArrayList<Integer> res) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(v).add(u);
        }
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int v : adj.get(i)) {
                indegree[v]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        int count=0;
        while (!q.isEmpty()) {
            int node = q.poll();
             res.add(node);
             count++;
            for (int v : adj.get(node)) {
                indegree[v]--;
                if (indegree[v] == 0) {
                    q.offer(v);
                }
            }
        }
        return count != V;
    }
}