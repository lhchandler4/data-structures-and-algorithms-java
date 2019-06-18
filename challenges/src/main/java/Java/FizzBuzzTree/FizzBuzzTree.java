package Java.FizzBuzzTree;

import Java.Tree.BinaryTree;
import Java.Tree.TreeNode;

public class FizzBuzzTree<T> {

    TreeNode<T> rootNode;

    public BinaryTree fizzBuzzTree(BinaryTree input){
        if (input.rootNode == null){
            throw new IllegalArgumentException("Ahhh");
        }
        if (input.rootNode != null) {
            fizzBuzzChecker(input.rootNode);
        }
        return input;
    }

    public TreeNode<T> fizzBuzzChecker(TreeNode node) {
        if (node == null) {
            return null;
        } else {
            changer(node);
        }
        fizzBuzzChecker(node.leftChild);
        fizzBuzzChecker(node.rightChild);
        return node;
        }

     public void changer(TreeNode node){
         if ((int) node.getData() % 15 == 0) {
             node.data = "FizzBuzz";
         } else if ((int) node.getData() % 3 == 0) {
             node.data = "Fizz";
         } else if ((int) node.getData() % 5 == 0) {
             node.data = "Buzz";
         }
     }

    }
