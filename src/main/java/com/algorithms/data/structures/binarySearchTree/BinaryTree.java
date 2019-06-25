package com.algorithms.data.structures.binarySearchTree;

public class BinaryTree {
    private TreeNode root;

    public void add(int value) {
        if(root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
}
