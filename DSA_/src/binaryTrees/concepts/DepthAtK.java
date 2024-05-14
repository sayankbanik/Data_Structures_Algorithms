package binaryTrees.concepts;

public class DepthAtK {
    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k){
        // base case
        if(root==null)
            return;
        // if depth is 0, print the root data, no need to go further
        if(k==0){
            System.out.print(root.data+" ");
        }
        printAtDepthK(root.left,k-1);
        printAtDepthK(root.right,k-1);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        int k = 4;
        System.out.print("Nodes at depth "+k+": ");
        printAtDepthK(root,k);

    }
}
