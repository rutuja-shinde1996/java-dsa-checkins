
/*
  Given a binary tree A. 
  Check whether it is possible to partition the tree to two trees which have 
  equal sum of values after removing exactly one edge on the original tree.

  Problem Constraints
  1 <= size of tree <= 100000
  0 <= value of node <= 109
   
  
  Problem:
   

  Difficulty:
   Medium

  Topics:
    Trees, Binary Tree

  Time Complexity:


  Space Complexity:


 */
package trees;

/**Definition for binary tree */
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
 
public class EqualTreePartition {
    boolean isEqualTreePossible = false;
    public int solve(TreeNode A) {
        long totalSum = sumTotal(A);
        if(totalSum % 2 == 1){
            return 0;
        }
        targetSum(A, totalSum/2);

        return isEqualTreePossible? 1 : 0;

    }

    public long sumTotal(TreeNode root){
        if(root == null){
            return 0;
        }

        long lsum = sumTotal(root.left);
        long rsum = sumTotal(root.right);

        long total = lsum + root.val + rsum;
        return total;
    }

    public long targetSum(TreeNode root, long target){
        if(root == null){
            return 0;
        }


        long lsum = targetSum(root.left, target);
        long rsum = targetSum(root.right, target);

        long total = lsum + root.val + rsum;
        if(total == target){
            isEqualTreePossible = true;
        }
        return total;
    }

}
