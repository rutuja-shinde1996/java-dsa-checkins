
/*
Problem:
https://leetcode.com/problems/binary-tree-inorder-traversal/description/

Difficulty:
Easy

Topics:
Trees, Binary Tree

Time Complexity:
O(n)

Space Complexity:
O(Height of Tree)
*/

import java.util.*;

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

public class InorderTraversal {
    ArrayList<Integer> ans = new ArrayList<Integer>();

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        inorder(A);
        return ans;
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }

}
