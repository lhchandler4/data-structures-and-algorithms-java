package Java.Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeNodeTest {
    @Test
    public void test_TreeNode(){
        TreeNode testing = new TreeNode(37);
        assertEquals(37, testing.data);
        assertEquals(null, testing.leftChild);
        assertEquals(null, testing.rightChild);
    }

}