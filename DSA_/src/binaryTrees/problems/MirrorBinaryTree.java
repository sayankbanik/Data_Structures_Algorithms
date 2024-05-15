package binaryTrees.problems;

import binaryTrees.concepts.BinaryTreeNode;
import binaryTrees.concepts.BinaryTreeUse;

public class MirrorBinaryTree {

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){ // top to bottom mirror
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            return;
        BinaryTreeNode<Integer> temp = root.left;
        root.left=root.right;
        root.right=temp;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
    }
    public static void mirrorBinaryTreeEditorial(BinaryTreeNode<Integer> root){ // bottom to top mirror
        if(root==null)
            return;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        BinaryTreeNode<Integer> temp = root.left;
        root.left=root.right;
        root.right=temp;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        BinaryTreeUse.printBinaryTreeLevelWise(root);
        System.out.println();
        mirrorBinaryTree(root);
        BinaryTreeUse.printBinaryTreeLevelWise(root);
        System.out.println();
        mirrorBinaryTreeEditorial(root);
        BinaryTreeUse.printBinaryTreeLevelWise(root);

    }
}
