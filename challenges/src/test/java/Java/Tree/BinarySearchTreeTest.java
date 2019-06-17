package Java.Tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    @Test
    public void testAddMethodGreater(){
        BinarySearchTree testing = new BinarySearchTree();
        testing.addTreeNode(41);
        testing.addTreeNode(123);
        assertEquals(41, testing.rootNode.data);
        assertEquals(123, testing.rootNode.rightChild.data);
    }

    @Test
    public void testAddMethodLess(){
        BinarySearchTree testing = new BinarySearchTree();
        testing.addTreeNode(41);
        testing.addTreeNode(39);
        assertEquals(41, testing.rootNode.data);
        assertEquals(39, testing.rootNode.leftChild.data);
    }

    @Test
    public void testSearchMethodTrue() {
        BinarySearchTree<Integer> testing = new BinarySearchTree<>();
        testing.addTreeNode(41);
        testing.addTreeNode(39);
        testing.addTreeNode(12);
        testing.addTreeNode(18);
        testing.addTreeNode(23);
        testing.addTreeNode(88);
        testing.addTreeNode(11);
        testing.addTreeNode(6);
        assertTrue(testing.searchTree(41));
    }

    @Test
    public void testSearchMethodFalse() {
        BinarySearchTree<Integer> testing = new BinarySearchTree<>();
        testing.addTreeNode(41);
        testing.addTreeNode(39);
        testing.addTreeNode(12);
        testing.addTreeNode(18);
        testing.addTreeNode(23);
        testing.addTreeNode(88);
        testing.addTreeNode(11);
        testing.addTreeNode(6);
        assertFalse(testing.searchTree(17));
    }

}
