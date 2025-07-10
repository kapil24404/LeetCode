/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static class Triple {
        TreeNode node;
        int hd;  // horizontal distance
        int lvl; // level (depth)

        Triple(TreeNode node, int hd, int lvl) {
            this.node = node;
            this.hd = hd;
            this.lvl = lvl;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        // Map: HD -> Level -> PriorityQueue of node values
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Triple> q = new LinkedList<>();
        q.add(new Triple(root, 0, 0));

        while (!q.isEmpty()) {
            Triple curr = q.poll();
            TreeNode node = curr.node;
            int hd = curr.hd;
            int lvl = curr.lvl;

            map.computeIfAbsent(hd, x -> new TreeMap<>())
                .computeIfAbsent(lvl, x -> new PriorityQueue<>())
                .offer(node.val);

            if (node.left != null) q.add(new Triple(node.left, hd - 1, lvl + 1));
            if (node.right != null) q.add(new Triple(node.right, hd + 1, lvl + 1));
        }

        for (TreeMap<Integer, PriorityQueue<Integer>> levelMap : map.values()) {
            List<Integer> column = new ArrayList<>();
            for (PriorityQueue<Integer> pq : levelMap.values()) {
                while (!pq.isEmpty()) {
                    column.add(pq.poll());
                }
            }
            result.add(column);
        }

        return result;
    }
}
