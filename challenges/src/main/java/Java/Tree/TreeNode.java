package Java.Tree;

public class TreeNode<T> {
    public T data;

    public TreeNode<T> leftChild;
    public TreeNode<T> rightChild;

    public TreeNode(T data){
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

}
