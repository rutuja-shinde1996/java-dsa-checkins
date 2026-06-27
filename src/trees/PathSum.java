/*
  Problem Description
    Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the 
    values along the path equals the given sum.

  Problem Constraints
    1 <= number of nodes <= 105
    -100000 <= B, value of nodes <= 100000
  
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
 
public class PathSum {
     public int hasPathSum(TreeNode A, int B) {

        if(A == null){
            return 0;
        }

        if(A.left == null && A.right == null && A.val == B){
            return 1;
        }
        int lans = hasPathSum(A.left, B-A.val);
        int rans = hasPathSum(A.right, B-A.val);

        if(lans == 1 || rans == 1){
            return 1;
        }
        return 0;
    }
}
