package com.algorithms.data.structures.binarySearchTree;

public class TreeNode {

    private Integer data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void traverse() {
        if(left != null) {
            left.traverse();
        }
        System.out.print(data + ", ");
        if(right != null) {
            right.traverse();
        }
    }

    public void preOrderTraverse() {
        System.out.print(data + ", ");
        if(left != null) {
            left.preOrderTraverse();
        }
        if(right != null) {
            right.preOrderTraverse();
        }
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

    public Integer get(int value) {
        if (data == value) {
            return value;
        }
        if (value < data && left != null) {
            return left.get(value);
        }
        if (value > data && right != null) {
            return right.get(value);
        }
        return null;
    }

    public Integer min() {
        return left == null ? data : left.min();
    }

    public Integer max() {
        return right == null ? data : right.max();
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
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
