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
    public void dfs(TreeNode root, int max, int[]numOfGoodNodes){
        
        if(root == null){
            return;
        }
        if(root.val >= max){
            // update the max for that path
            max = root.val;
            numOfGoodNodes[0]++;
        }
        dfs(root.left, max,numOfGoodNodes);
        dfs(root.right, max,numOfGoodNodes);
    }
    public int goodNodes(TreeNode root) {
        //  
        int[] numOfGoodNodes = new int[1];
        // int max= root.val;
        dfs(root, Integer.MIN_VALUE, numOfGoodNodes);
        return numOfGoodNodes[0];
    }
}