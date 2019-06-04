package Java.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testNode() {
        Node testNode = new Node(5);
        assertEquals(5, testNode.data);
    }

    @Test
    public void intantiateEmptyList() {
        LinkedList testing = new LinkedList();
    }

    @Test
    public void test_Insert() {
        LinkedList testing = new LinkedList();
        testing.insert(6);
        LinkedList secondTest = new LinkedList();
        secondTest.insert(8);
        assertEquals(6,testing.head.data);
    }

    @Test
    public void test_Insert_multiple_values() {
        LinkedList testing = new LinkedList();
        testing.insert(6);
        testing.insert(3);
        testing.insert(4);
        testing.insert(2);
        testing.insert(1);
        assertEquals(1,testing.head.data);
        assertEquals(2,testing.head.next.data);
    }

    @Test
    public void test_Includes() {
        LinkedList testing = new LinkedList();
        testing.insert(6);
        testing.insert(3);
        testing.insert(4);
        testing.insert(2);
        testing.insert(1);
        assertTrue("should return true when value searched for is in the Linked List", testing.includes(4));
    }

    @Test
    public void test_Includes_False() {
        LinkedList testing = new LinkedList();
        testing.insert(6);
        testing.insert(3);
        testing.insert(4);
        testing.insert(2);
        testing.insert(1);
        assertFalse("should return false when value searched for is not in the Linked List", testing.includes(7));
    }

    @Test
    public void test_Print() {
        LinkedList testing = new LinkedList();
        testing.insert(6);
        testing.insert(3);
        testing.insert(4);
        testing.insert(2);
        testing.insert(1);
        assertEquals("1, 2, 4, 3, 6, null", testing.prints());
    }

    @Test
    public void test_Append() {
        LinkedList testing = new LinkedList();
        testing.append(6);
        testing.append(3);
        testing.append(4);
        testing.append(2);
        testing.append(1);
        assertEquals("6, 3, 4, 2, 1, null", testing.prints());
    }

    @Test
    public void test_Insert_Before() {
        LinkedList testing = new LinkedList();
        testing.insert(6);
        testing.insert(3);
        testing.insert(4);
        testing.insert(2);
        testing.insert(1);
        testing.insertBefore(4,12);
        assertEquals("1, 2, 12, 4, 3, 6, null", testing.prints());
    }

    @Test
    public void test_Insert_After() {
        LinkedList testing = new LinkedList();
        testing.insert(6);
        testing.insert(3);
        testing.insert(4);
        testing.insert(2);
        testing.insert(1);
        testing.insertAfter(4,12);
        assertEquals("1, 2, 4, 12, 3, 6, null", testing.prints());
    }

}
