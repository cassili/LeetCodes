package com.Tree.BinaryTreeInorderTraversal94;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/16 13:33
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
    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        inOrder(root, list);
        return list;
    }

    public static void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(2, treeNode3, null);
        TreeNode treeNode1 = new TreeNode(1, null, treeNode2);
        List<Integer> list = inorderTraversal(treeNode1);
        for (Integer integer : list) {
            System.out.println(integer);
        }


    }

}
