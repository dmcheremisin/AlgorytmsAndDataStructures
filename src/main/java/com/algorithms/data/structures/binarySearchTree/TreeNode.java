package com.algorithms.data.structures.binarySearchTree;

public class TreeNode {

    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if(value == data) {
            return;
        }
        if(value < data) {
            if(left == null) {
                left = new TreeNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if(right == null) {
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
