package Java.Tree;

import java.util.ArrayList;

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
}
