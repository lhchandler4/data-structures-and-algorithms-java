package Java.Tree;

public class BinarySearchTree<T extends Comparable<T>> {

    TreeNode<T> rootNode;

//    public void addTreeNodeRecur(T data){
//        addTreeNodeRecur(data, rootNode);
//
//    }
//
//    public TreeNode<T> addTreeNodeRecur(T data, TreeNode<T> node){
//        if(node == null){
//            return new TreeNode(data);
//        }else if(data.compareTo(node.data) < 0) {
//            node.leftChild = addTreeNodeRecur(data, node);
//        }else{
//            node.rightChild = addTreeNodeRecur(data, node);
//        }
//        return node;
//    }

    public void addTreeNode(T data){

        TreeNode newTreeNode = new TreeNode(data);
        if (rootNode == null){

            rootNode = newTreeNode;

        }else{

            TreeNode<T> currentNode = rootNode;

            TreeNode parent;

            while (true){

                parent = currentNode;

                if(data.compareTo(currentNode.data) < 0){
                    currentNode = currentNode.leftChild;
                    if(currentNode == null){
                        parent.leftChild = newTreeNode;
                        return;
                    }
                }else{
                    currentNode = currentNode.rightChild;
                    if(currentNode == null){
                        parent.rightChild = newTreeNode;
                        return;
                    }
                }

            }
        }

    }



    public boolean searchTree(T data) {

        TreeNode currentNode = rootNode;

        while (currentNode.data != data) {

            if (data.equals(currentNode.data)) {

                currentNode = currentNode.leftChild;

            } else {

                currentNode = currentNode.rightChild;

            }

            if (currentNode == null)

            return false;

        }

        return true;

    }

}
