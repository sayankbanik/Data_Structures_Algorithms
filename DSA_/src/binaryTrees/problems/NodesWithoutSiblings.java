package binaryTrees.problems;

import binaryTrees.concepts.BinaryTreeNode;
import binaryTrees.concepts.BinaryTreeUse;

import java.sql.SQLOutput;

public class NodesWithoutSiblings {
    private static void printNodesWithoutSiblings(BinaryTreeNode<Integer> root) {
        if(root==null)
            return;
        if(root.left==null || root.right==null){
            if(root.left!=null)
                System.out.print(root.left.data+" ");
            else if(root.right!=null)
                System.out.print(root.right.data+" ");
        }
        printNodesWithoutSiblings(root.left);
        printNodesWithoutSiblings(root.right);

    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        BinaryTreeUse.printBinaryTreeLevelWise(root);
        System.out.println();
        printNodesWithoutSiblings(root);
    }


}
