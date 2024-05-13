package binaryTrees.concepts;

public class BinaryTreeNode<Type> {
    // members
    public Type data;
    BinaryTreeNode<Type> left;
    BinaryTreeNode<Type> right;

    //constructors
    public BinaryTreeNode(){
        // default empty constructor;
    }
    public BinaryTreeNode(Type data){
        this.data = data;
    }
}
