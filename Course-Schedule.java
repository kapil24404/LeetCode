class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        return !isCyclic(numCourses, prerequisites);
    }

    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Fix: reverse the edge direction
        for (int[] edge : edges) {
            int u = edge[0];  // course
            int v = edge[1];  // prerequisite
            adj.get(v).add(u);  // edge from prerequisite → course
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

        int count = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            count++;
            for (int v : adj.get(node)) {
                indegree[v]--;
                if (indegree[v] == 0) {
                    q.offer(v);
                }
            }
        }

        return count != V;  // true means a cycle exists
    }
}
