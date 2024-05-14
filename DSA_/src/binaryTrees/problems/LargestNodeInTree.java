/*
* Problem : Find the largest node in Binary tree
* assumption all node data is positive
* */
package binaryTrees.problems;
import binaryTrees.concepts.BinaryTreeNode;
import binaryTrees.concepts.BinaryTreeUse;

public class LargestNodeInTree {
    public static int largestNode(BinaryTreeNode<Integer> root){
        if(root==null)
            return -1;
        // find the largest node in left and right subtree
        int largestLeft = largestNode(root.left);
        int largestRight = largestNode(root.right);
        // then compare the children data to their parent data, return the max among them
        return Math.max(root.data,Math.max(largestRight,largestLeft));

    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        int largest = largestNode(root);
        System.out.println(largest);
    }
}
