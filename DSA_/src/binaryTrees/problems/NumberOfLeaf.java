package binaryTrees.problems;

import binaryTrees.concepts.BinaryTreeNode;
import binaryTrees.concepts.BinaryTreeUse;

public class NumberOfLeaf {
    public static int numberOfLeaf(BinaryTreeNode<Integer> root){
        if(root==null)
            return 0;
        //if root is leaf return 1;
        if(root.left==null && root.right==null)
            return 1;
        int totalLeftLeaf = numberOfLeaf(root.left);
        int totalRightLeaf = numberOfLeaf(root.right);
        return totalRightLeaf+totalLeftLeaf;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        int ans = numberOfLeaf(root);
        System.out.println(ans);
    }
}
