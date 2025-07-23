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
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxnode(root);
        return maxsum;
    }
    public int maxnode(TreeNode root){
        if(root==null) return 0;
        int lefth=Math.max(0,maxnode(root.left));
        int righth=Math.max(0,maxnode(root.right));
        maxsum=Math.max(maxsum,root.val+lefth+righth);
        return root.val+Math.max(lefth,righth);
    }
}