package binaryTrees.concepts;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> takeInputBinaryTree(){
        Scanner sc = new Scanner(System.in);
        // take the root data input
        System.out.print("Enter the root: ");
        int rootData = sc.nextInt();
        // base case
        if(rootData == -1)
            return null;
        // create the root node
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        // create the node for left child
        // recursive call, first we take all left child until null
        BinaryTreeNode<Integer> leftChild = takeInputBinaryTree();
        // create node for right child
        // recursive call, next we take all right child until null
        BinaryTreeNode<Integer> rightChild = takeInputBinaryTree();
        // now connect the nodes
        root.left = leftChild;
        root.right = rightChild;
        return root;

    }
    public static BinaryTreeNode<Integer> takeInputBinaryTreeBetter(boolean isRoot,int parentData, boolean isLeft){
          Scanner sc = new Scanner(System.in);
          // take root data
        if(isRoot){ // checking if it is root or not;
            System.out.print("Enter the root:");
        }else{
            if(isLeft){ // checking if it is left child
                System.out.print("Enter the left child of "+parentData+": ");
            }else{ // checking if it is right child
                System.out.print("Enter the right child of "+parentData+": ");
            }
        }
        int rootData = sc.nextInt();
        // base case
        if(rootData == -1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInputBinaryTreeBetter(false,root.data,true);
        root.right = takeInputBinaryTreeBetter(false,root.data,false);
        return root;
    }
    public static BinaryTreeNode<Integer> takeInputTreeLevelWise(){
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        // asking for root data
        System.out.print("Enter the root: ");
        int rootData = sc.nextInt();
        // if root is -1 just return null
        if(rootData == -1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        // adding root node to the queue
        queue.add(root);
        while(!queue.isEmpty()){
            // taking out the first element of the queue, which is root of children
            BinaryTreeNode<Integer> front = queue.poll();
            // ask for left child data
            System.out.print("Enter the left child of "+front.data+": ");
            int leftChildData = sc.nextInt();
            if(leftChildData!=-1){
                // creating left child node
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(leftChildData);
                // adding left child node to the queue
                queue.add(leftChild);
                // connecting left child to its parent node (front)
                front.left = leftChild;
            }
            // asking for right child data
            System.out.print("Enter the right child of "+front.data+": ");
            int rightChildData = sc.nextInt();
            if(rightChildData!=-1){
                // creating the right child node
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(rightChildData);
                // adding right child node to the queue
                queue.add(rightChild);
                // connecting right child to its parent
                front.right = rightChild;
            }
        }
        return root;
    }
    public static void printBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null)
            return;
        System.out.print(root.data + " ");
        printBinaryTree(root.left);
        printBinaryTree(root.right);

    }
    public static void printBinaryTreeDetailed(BinaryTreeNode<Integer> root){
        if(root==null)
            return;
        // print the root
        System.out.print(root.data+": ");
        // check if root.left is not null then print the left child
        if(root.left!=null)
            System.out.print("L:"+root.left.data+", ");
        //check if root.right is not null then print the right child
        if(root.right!=null)
            System.out.print("R:"+root.right.data);
        System.out.println();
        // go to the Left sub tree
        printBinaryTreeDetailed(root.left);
        // go to the Right sub tree
        printBinaryTreeDetailed(root.right);
    }
    public static void printBinaryTreeLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root); // 1
        }
        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> front = queue.poll(); //1
            System.out.print(front.data+": ");
            if(front.left!=null){
                queue.add(front.left);
                System.out.print("L:"+front.left.data+", ");
            }else{
                System.out.print("L:"+-1+", ");
            }
            if(front.right!=null){
                queue.add(front.right);
                System.out.print("R:"+front.right.data);
            }else{
                System.out.print("R:"+-1+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // creating the root node
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // creating the left child node
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        //creating the right child node
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        // connect the child nodes to the root
        root.left = rootLeft;
        root.right = rootRight;
        // we are adding children to our sub-trees
        BinaryTreeNode<Integer> left2s = new BinaryTreeNode<>(4);
        rootLeft.left = left2s;
        BinaryTreeNode<Integer> right2s = new BinaryTreeNode<>(5);
        rootLeft.right = right2s;
        rootRight.left = new BinaryTreeNode<>(6);
        rootRight.right = new BinaryTreeNode<>(7);
        // what above tree we desired
//                   1
//                  / \
//                 2   3
//                / \ / \
//               4  5 6  7
    printBinaryTree(root);
    System.out.println("-----------------------------------------------");
//    root = takeInputBinaryTree();
//    root = takeInputBinaryTreeBetter(true,0,true);
        root = takeInputTreeLevelWise();
//    printBinaryTreeDetailed(root);
        printBinaryTreeLevelWise(root);
    }

}
