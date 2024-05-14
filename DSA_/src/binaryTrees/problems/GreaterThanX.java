package binaryTrees.problems;

import binaryTrees.concepts.BinaryTreeNode;
import binaryTrees.concepts.BinaryTreeUse;

/**
 * For a given a binary tree of integers and an integer X,
 * find and return the total number of nodes of the given binary tree which are having data greater than X
 */
public class GreaterThanX {
    // Solution 01 -- > bottom to top counting
    public static int greaterThanX(BinaryTreeNode<Integer> root, int x){
        if(root==null)
            return 0;
        int leftCount = greaterThanX(root.left,x);
        int rightCount = greaterThanX(root.right,x);
        if(root.data > x)
            return 1 + leftCount + rightCount;
        else
            return leftCount + rightCount;
    }
    // solution 2 ; top to bottom approach, counting id greater than x going to bottom of tree
    public static int greaterThanXEditorial(BinaryTreeNode<Integer> root, int x){
        if(root==null)
            return 0;
        // first checking root data > x or not, and count it
        int count = (root.data > x) ? 1 : 0;
        // then going for left child to check, if root(child) > x, add 1 to count
        if(root.left!=null)
            count = count + greaterThanXEditorial(root.left,x);
        // then going for right child to check, if root(child) > x, add 1 to count
        if(root.right!=null)
            count = count + greaterThanXEditorial(root.right,x);
        return count;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        int x = 2;
        int ans = greaterThanX(root,x);
        int ans1 = greaterThanXEditorial(root,x);
        System.out.println(ans+" "+ans1);
    }
}
