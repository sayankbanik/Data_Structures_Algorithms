package binaryTrees.problems;

import binaryTrees.concepts.BinaryTreeNode;
import binaryTrees.concepts.BinaryTreeUse;

public class RemoveLeafNodes {
    public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root){
        // base case
        if(root==null)
            return null;
        // if root is leaf return null
        if(root.left==null && root.right==null)
            return null;
        // call the LST and add the return value to its root's left
        root.left = removeLeafNodes(root.left);
        // call the RST and add the return value to its root's right
        root.right = removeLeafNodes(root.right);
        // finally return the root
        return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        BinaryTreeUse.printBinaryTreeLevelWise(root);
        System.out.println("after removing leaves");
        root = removeLeafNodes(root);
        BinaryTreeUse.printBinaryTreeLevelWise(root);
    }
}
