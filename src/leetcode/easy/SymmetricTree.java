package leetcode.easy;

/**
 *101、Symmetric Tree对称树
 Description
 Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

            1
          /  \
         2    2
       / \   /  \
      3  4  4   3
 But the following [1,2,2,null,3,null,3] is not:

      1
     / \
    2   2
     \   \
     3    3
 Note:

 Bonus points if you could solve it both recursively and iteratively.

 Tags: Tree, Depth-first Search, Breadth-first Search
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return root==null||isSymmetricJudge(root.left,root.right);
    }

    public boolean isSymmetricJudge(TreeNode left,TreeNode right){
        if (left==null&&right==null){return true;}
        if (left==null||right==null){return false;}
            if (left.val==right.val){
                return isSymmetricJudge(left.left,right.right)&&isSymmetricJudge(left.right,right.left);
            }
            return false;
    }
}
