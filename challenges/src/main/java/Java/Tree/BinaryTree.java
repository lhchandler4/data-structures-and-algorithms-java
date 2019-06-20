package Java.Tree;

import Java.stacksandqueues.Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

    public TreeNode<T> rootNode;

    public TreeNode<T> getRootNode() {
        return rootNode;
    }

    public void setRootNode(TreeNode<T> rootNode) {
        this.rootNode = rootNode;
    }

    public BinaryTree(){
        rootNode = null;
    }

    public ArrayList<T> inOrderTraverse(){

        ArrayList<T> inOrderArrLi = new ArrayList<>();

        if (this.rootNode != null) {
            inOrderHelper(this.rootNode, inOrderArrLi);
            }
            return inOrderArrLi;
    }

    public void inOrderHelper(TreeNode<T> node, ArrayList<T> helperArrLi){
        if(node.leftChild != null){
            inOrderHelper(node.leftChild, helperArrLi);
        }
        helperArrLi.add(node.data);
        if(node.rightChild != null){
            inOrderHelper(node.rightChild, helperArrLi);
        }
    }

    public ArrayList<T> preOrderTraverse(){

        ArrayList<T> preOrderArrLi = new ArrayList<>();

        if (this.rootNode != null) {
            preOrderHelper(this.rootNode, preOrderArrLi);
        }
        return preOrderArrLi;
    }

    public void preOrderHelper(TreeNode<T> node, ArrayList<T> helperArrLi){
        helperArrLi.add(node.data);
        if(node.leftChild != null){
            preOrderHelper(node.leftChild, helperArrLi);
        }
        if(node.rightChild != null){
            preOrderHelper(node.rightChild, helperArrLi);
        }
    }

    public ArrayList<T> postOrderTraverse(){

        ArrayList<T> postOrderArrLi = new ArrayList<>();

        if (this.rootNode != null) {
            postOrderHelper(this.rootNode, postOrderArrLi);
        }
        return postOrderArrLi;
    }

    public void postOrderHelper(TreeNode<T> node, ArrayList<T> helperArrLi){
        if(node.leftChild != null){
            postOrderHelper(node.leftChild, helperArrLi);
        }
        if(node.rightChild != null){
            postOrderHelper(node.rightChild, helperArrLi);
        }
        helperArrLi.add(node.data);
    }

//    public void breadthFirst(BinaryTree input) {
//        Queue<TreeNode> q = new LinkedList<>();
//        //enqueue
//        q.add(input.rootNode);
//        //dequeue
//        while(q != null){
//            System.out.println(q.remove());
//            q.add(input.rootNode.leftChild);
//            q.add(input.rootNode.rightChild);
//        }
//    }

    public static String breadthFirst(BinaryTree input) {
        if(input.rootNode == null)
            return "null";

        Queue<TreeNode> q =new LinkedList<TreeNode>();
        String m = "";
        q.add(input.rootNode);

        while(true) {
            int levelCount = q.size();
            if(levelCount == 0)
                break;
            while(levelCount > 0)
            {
                TreeNode node = q.peek();
                System.out.print(node.data + " ");
                m += node.data + "\n";
                q.remove();
                if(node.leftChild != null)
                    q.add(node.leftChild);
                if(node.rightChild != null)
                    q.add(node.rightChild);
                levelCount--;
            }
        }return m;
    }

    public int findMaxValue(BinaryTree input) {
        if(input.rootNode == null) throw new IllegalArgumentException();
        return findMaxValue(input.rootNode);
    }

    private int findMaxValue(TreeNode input) {
        if (input == null)
            return Integer.MIN_VALUE;
        else {
            int max = (int)input.data;
            int lMax = findMaxValue(input.leftChild);
            int rMax = findMaxValue(input.rightChild);
            max = Math.max(Math.max(max, lMax), rMax);
            return max;
        }
    }
}
