package leetcode.easy;

/**
 * 104、Maximum Depth of Binary Tree
 Description
 Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 Note: A leaf is a node with no children.

 Example:

 Given binary tree [3,9,20,null,null,15,7],

      3
     / \
   9   20
  /     \
 15      7
 return its depth = 3.

 Tags: Tree, Depth-first Search
 */
public class MaximumDepthofBinaryTree {

    //方法1，1ms
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    //方法2，0ms
    public int maxDepthB(TreeNode root){
        int depth=1;
        return getDepath(root,depth);
    }
    public int getDepath(TreeNode node,int d){
        if(node==null) return 0;
        if (node.left==null&&node.right==null)return d;
        d+=1;
        int left=getDepath(node.left,d);
        int right=getDepath(node.right,d);
        return left>right?left:right;
    }

}
