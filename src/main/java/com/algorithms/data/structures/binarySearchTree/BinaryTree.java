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

    public void delete(Integer value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode parent, Integer value) {
        if(parent == null) {
            return null;
        }
        if(value < parent.getData()){
            parent.setLeft(delete(parent.getLeft(), value));
        }
        else if(value > parent.getData()) {
            parent.setRight(delete(parent.getRight(), value));
        }
        else {
            if (parent.getLeft() == null) {
                return parent.getRight();
            }
            if (parent.getRight() == null) {
                return parent.getLeft();
            }
            Integer min = parent.getRight().min();
            parent.setData(min);
            parent.setRight(delete(parent.getRight(), min));
        }
        return parent;
    }

    public void traverse() {
        if(root != null) {
            root.traverse();
        }
        System.out.println();
    }

    // visit the root first
    public void preOrderTraversal() {
        if(root != null) {
            root.preOrderTraverse();
        }
        System.out.println();
    }
}
