package binaryTrees.problems;

import binaryTrees.concepts.BinaryTreeNode;
import binaryTrees.concepts.BinaryTreeUse;

public class ReplaceNodeWithDepth {
    public static void replaceNodeWithDepth(BinaryTreeNode<Integer> root,int k){
        if(root==null)
            return;
        replaceNodeWithDepth(root.left,k+1);
        replaceNodeWithDepth(root.right,k+1);
        root.data = k;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        BinaryTreeUse.printBinaryTreeLevelWise(root);
        replaceNodeWithDepth(root,0);
        BinaryTreeUse.printBinaryTreeLevelWise(root);

    }
}
