package Java.TreeIntersection;

import Java.Tree.BinaryTree;
import Java.Tree.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    public BinaryTree<Integer> TreeOne;
    public BinaryTree<Integer> TreeTwo;

    @Before
    public void initializingTheTrees() {
        this.TreeOne = new BinaryTree<>();
        TreeNode<Integer> rootOne = new TreeNode<>(12);
        TreeNode<Integer> lOne = new TreeNode<>(16);
        TreeNode<Integer> rOne = new TreeNode<>(2);
        TreeNode<Integer> llOne = new TreeNode<>(-5);
        TreeNode<Integer> lrOne = new TreeNode<>(99);
        TreeNode<Integer> rlOne = new TreeNode<>(56);
        TreeNode<Integer> rrOne = new TreeNode<>(634);
        rootOne.setLeftChild(lOne);
        lOne.setLeftChild(llOne);
        lOne.setRightChild(lrOne);
        rootOne.setRightChild(rOne);
        rOne.setLeftChild(rlOne);
        rOne.setRightChild(rrOne);
        TreeOne.setRootNode(rootOne);

        this.TreeTwo = new BinaryTree<>();
        TreeNode<Integer> rootTwo = new TreeNode<>(634);
        TreeNode<Integer> lTwo = new TreeNode<>(73);
        TreeNode<Integer> rTwo = new TreeNode<>(1);
        TreeNode<Integer> llTwo = new TreeNode<>(56);
        TreeNode<Integer> lrTwo = new TreeNode<>(2);
        TreeNode<Integer> rlTwo = new TreeNode<>(99);
        TreeNode<Integer> rrTwo = new TreeNode<>(22);
        rootTwo.setLeftChild(lTwo);
        lTwo.setLeftChild(llTwo);
        lTwo.setRightChild(lrTwo);
        rootTwo.setRightChild(rTwo);
        rTwo.setLeftChild(rlTwo);
        rTwo.setRightChild(rrTwo);
        TreeTwo.setRootNode(rootTwo);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIllegal_Argument_Exception(){
        BinaryTree<Integer> TreeThree = new BinaryTree<>();
        TreeIntersection.tree_intersection(TreeThree, TreeTwo);
    }
    
    @Test
    public void testThe_Tree_Intersection() {
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(2, 99, 56, 634));
        assertEquals(expectedOutput, TreeIntersection.tree_intersection(TreeOne, TreeTwo));
    }



}