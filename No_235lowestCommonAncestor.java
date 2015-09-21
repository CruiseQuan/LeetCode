/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         while(((long)root.val-p.val)*((long)root.val-q.val)>0)//说明pq在root同一子树
        	root=root.val>p.val?root.left:root.right;       
        return root;//循环结束说明一个在左子树，一个在右子树，或者某结点就是当前root
    }
}
