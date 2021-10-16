package com.Tree.SameTree100;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/16 14:02
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(1, null, treeNode2);
        TreeNode treeNode1 = new TreeNode(1, treeNode2, null);

        boolean t = isSameTree(treeNode1, treeNode3);

        System.out.println(t);

    }
}
