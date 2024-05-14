package binaryTrees.concepts;

public class Height {
    public static int heightOfTree(BinaryTreeNode<Integer> root){
        if(root==null)
            return 0;
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return 1 + Math.max(leftHeight,rightHeight);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        BinaryTreeUse.printBinaryTreeLevelWise(root);
        int height = heightOfTree(root);
        System.out.println(height);
    }
}
