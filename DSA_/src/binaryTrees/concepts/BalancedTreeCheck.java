package binaryTrees.concepts;

public class BalancedTreeCheck {
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight,rightHeight);
    }
    public static boolean isTreeBalanced(BinaryTreeNode<Integer> root){
        if(root==null)
            return true;
        // find the height of left subtree and right subtree
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        //
        if(Math.abs(leftHeight-rightHeight) > 1){
            return false;
        }
        // else check for the root of LST and RST
        boolean isLeftTreeBalanced = isTreeBalanced(root.left);
        boolean isRightTreeBalanced = isTreeBalanced(root.right);
        // if both LST and RST are balanced then return true;
        return isLeftTreeBalanced && isRightTreeBalanced;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputTreeLevelWise();
        System.out.println("is Tree Balanced? " + isTreeBalanced(root));

    }
}
