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
    public int goodNodes(TreeNode root) {
        return rec(root , 0 , Integer.MIN_VALUE);
    }
    public int rec(TreeNode root , int ans , int prevMax){
        if(root == null)return 0;
        int currans = 0;
        if(root.val >= prevMax){
            currans = 1;
            prevMax = root.val;
        }
        int lans = rec(root.left , ans , prevMax);
        int rans = rec(root.right , ans , prevMax);
        return lans + rans + currans;
    }
}
