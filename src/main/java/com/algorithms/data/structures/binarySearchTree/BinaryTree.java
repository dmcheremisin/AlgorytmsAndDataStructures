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

    public Integer get(int value) {
        return root == null ? null : root.get(value);
    }

    public Integer min() {
        return root == null ? null : root.min();
    }

    public Integer max() {
        return root == null ? null : root.max();
    }

    public void traverse() {
        if(root != null) {
            root.traverse();
        }
        System.out.println();
    }
}
