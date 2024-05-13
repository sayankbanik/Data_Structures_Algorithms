package binaryTrees.problems;

import binaryTrees.concepts.BinaryTreeNode;
import binaryTrees.concepts.BinaryTreeUse;

public class NumberOfNodes {
    public static int numberOfNodes(BinaryTreeNode<Integer> root){
        if(root==null)
            return 0;
        int countLeft = numberOfNodes(root.left);
        int countRight = numberOfNodes(root.right);
        return countRight+countLeft+1;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputBinaryTreeBetter(true,0,true);
        int ans = numberOfNodes(root);
        System.out.println(ans);
    }
}
