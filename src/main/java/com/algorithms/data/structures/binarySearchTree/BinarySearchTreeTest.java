package com.algorithms.data.structures.binarySearchTree;

public class BinarySearchTreeTest {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(25);
        tree.add(20);
        tree.add(15);
        tree.add(27);
        tree.add(30);
        tree.add(29);
        tree.add(26);
        tree.add(22);
        tree.add(32);
        tree.add(17);

        tree.traverse(); // 15, 17, 20, 22, 25, 26, 27, 29, 30, 32,
        tree.preOrderTraversal(); // 25, 20, 15, 17, 22, 27, 26, 30, 29, 32,

        System.out.println(tree.get(27)); // 27
        System.out.println(tree.get(22)); // 22
        System.out.println(tree.get(333)); // null

        System.out.println(tree.min()); // 15
        System.out.println(tree.max()); // 32

        tree.delete(27);
        tree.traverse(); // 15, 17, 20, 22, 25, 26, 29, 30, 32,
    }
}
