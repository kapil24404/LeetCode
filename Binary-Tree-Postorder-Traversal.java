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
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> ans=new ArrayList<>();
     if(root==null) return ans;
         preorder(root,ans);
         return ans;
    }
    public static void preorder(TreeNode root,List<Integer> ans){
        if(root==null) return;
        preorder(root.left,ans);
        preorder(root.right,ans);
         ans.add(root.val);
}

//2 stacks
    // public List<Integer> postorderTraversal(TreeNode root) {
    //         List<Integer> ans=new ArrayList<>();
    //         Stack<TreeNode> st1=new Stack<>();
    //         Stack<TreeNode> st2=new Stack<>();
    //         if(root==null) return ans;
    //         st1.push(root);
    //         while(!st1.isEmpty()){
    //             root=st1.pop();
    //             st2.push(root);
    //             if(root.left!=null) st1.push(root.left);
    //             if(root.right!=null) st1.push(root.right);
    //         }
    //         while(!st2.isEmpty()){
    //             ans.add(st2.pop().val);
    //         }
    //         return ans;
    // }

    //1 stack

    //  public List<Integer> postorderTraversal(TreeNode root) {
    //         List<Integer> ans=new ArrayList<>();
    //         Stack<TreeNode> st=new Stack<>();
    //         TreeNode curr=root;
    //         //st.add(curr);
    //         while(curr!=null &&!st.isEmpty()){
    //             while(curr!=null){
    //                 st.add(curr);
    //                 curr=curr.left;
    //             }
    //             if(curr.right==null) {
    //                 curr=st.pop();
    //                 ans.add(curr.val);
    //             }
    //             else{
    //                 curr=curr.right;
    //                 st.add(curr);
    //             }
    //         }
    //         return ans;
    // }
}