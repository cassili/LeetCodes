package com.Tree.SymmetricTree101;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/16 15:00
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public boolean compare(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null)  return true;
        else if (r1 == null || r2 == null || r1.val != r2.val)   return false;
        return compare(r1.left, r2.right) && compare(r1.right, r2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

}
