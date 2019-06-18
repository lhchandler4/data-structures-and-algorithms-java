package Java.FizzBuzzTree;

import Java.Tree.BinaryTree;
import Java.Tree.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTreeTest {

    public BinaryTree<Integer> testing;



    @Test
    public void testFizzBuzz() {
        TreeNode<Integer> root = new TreeNode<>(30);
        TreeNode<Integer> l = new TreeNode<>(100);
        TreeNode<Integer> r = new TreeNode<>(9);
        TreeNode<Integer> ll = new TreeNode<>(4);
        TreeNode<Integer> lr = new TreeNode<>(50);
        TreeNode<Integer> rl = new TreeNode<>(6);
        root.setLeftChild(l);
        l.setLeftChild(ll);
        l.setRightChild(lr);
        root.setRightChild(r);
        r.setLeftChild(rl);
        this.testing = new BinaryTree<>();
        this.testing.setRootNode(root);
        FizzBuzzTree fizzTree = new FizzBuzzTree();
        fizzTree.fizzBuzzTree(testing);
        assertEquals(new ArrayList<>(Arrays.asList(4, "Buzz", "Buzz", "FizzBuzz", "Fizz", "Fizz")), testing.inOrderTraverse());
    }

    @Test
    public void testFizzBuzzNeg() {
        TreeNode<Integer> root = new TreeNode<>(-30);
        TreeNode<Integer> l = new TreeNode<>(-100);
        TreeNode<Integer> r = new TreeNode<>(-9);
        TreeNode<Integer> ll = new TreeNode<>(-4);
        TreeNode<Integer> lr = new TreeNode<>(-50);
        TreeNode<Integer> rl = new TreeNode<>(-6);
        root.setLeftChild(l);
        l.setLeftChild(ll);
        l.setRightChild(lr);
        root.setRightChild(r);
        r.setLeftChild(rl);
        this.testing = new BinaryTree<>();
        this.testing.setRootNode(root);
        FizzBuzzTree fizzTree = new FizzBuzzTree();
        fizzTree.fizzBuzzTree(testing);
        assertEquals(new ArrayList<>(Arrays.asList(-4, "Buzz", "Buzz", "FizzBuzz", "Fizz", "Fizz")), testing.inOrderTraverse());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmpty(){
        this.testing = new BinaryTree<>();
        FizzBuzzTree fizzTree = new FizzBuzzTree();
        fizzTree.fizzBuzzTree((testing));
    }



}