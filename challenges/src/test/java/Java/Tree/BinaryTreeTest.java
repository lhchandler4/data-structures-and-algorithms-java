package Java.Tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    public BinaryTree<Integer> testing;

    @Before
    public void setUpBinaryTree() {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> l = new TreeNode<>(2);
        TreeNode<Integer> r = new TreeNode<>(3);
        TreeNode<Integer> ll = new TreeNode<>(4);
        TreeNode<Integer> lr = new TreeNode<>(5);
        TreeNode<Integer> rl = new TreeNode<>(6);
        root.setLeftChild(l);
        l.setLeftChild(ll);
        l.setRightChild(lr);
        root.setRightChild(r);
        r.setLeftChild(rl);
        this.testing = new BinaryTree<>();
        this.testing.setRootNode(root);
    }

    @Test
    public void testPreOrder() {
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3, 6)), this.testing.preOrderTraverse());
    }

    @Test
    public void testInOrder() {
        assertEquals(new ArrayList<>(Arrays.asList(4, 2, 5, 1, 6, 3)), this.testing.inOrderTraverse());
    }

    @Test
    public void testPostOrder() {
        assertEquals(new ArrayList<>(Arrays.asList(4, 5, 2, 6, 3, 1)), this.testing.postOrderTraverse());
    }
}
