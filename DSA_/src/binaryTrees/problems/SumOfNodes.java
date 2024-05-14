package binaryTrees.problems;

import binaryTrees.concepts.BinaryTreeNode;
import binaryTrees.concepts.BinaryTreeUse;

public class SumOfNodes {
    public static int sumOfNodes(BinaryTreeNode<Integer> root){
        if(root==null)
            return 0;
        // find the sum in left subtree;
        int leftSum = sumOfNodes(root.left);
        // find the sum in right subtree;
        int rightSum = sumOfNodes(root.right);
        // add the root data with leftSum and rightSum
        return root.data+leftSum+rightSum;
    }
    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        int sum = sumOfNodes(root);
        System.out.println(sum);
    }
}
