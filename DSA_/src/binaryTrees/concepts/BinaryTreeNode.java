package binaryTrees.concepts;

public class BinaryTreeNode<Type> {
    // members
    public Type data;
    public BinaryTreeNode<Type> left;
    public BinaryTreeNode<Type> right;

    //constructors
    public BinaryTreeNode(){
        // default empty constructor;
    }
    public BinaryTreeNode(Type data){
        this.data = data;
    }
}
