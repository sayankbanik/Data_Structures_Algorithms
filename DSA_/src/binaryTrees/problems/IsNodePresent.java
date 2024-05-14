/*
* For a given Binary Tree of type integer and a number X, find whether a node exists in the tree with data X or not.
* */
package binaryTrees.problems;

import binaryTrees.concepts.BinaryTreeNode;
import binaryTrees.concepts.BinaryTreeUse;

public class IsNodePresent {
    public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
        if(root==null)
            return false;
        if(root.data==x){
            return true;
        }
        return isNodePresent(root.left,x) || isNodePresent(root.right,x);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        int x = 2;
        boolean ans = isNodePresent(root,x);
        System.out.println(ans);
    }
}
