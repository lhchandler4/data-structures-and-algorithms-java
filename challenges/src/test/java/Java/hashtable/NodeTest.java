package Java.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void testNode(){
        Node<Integer> testing = new Node<Integer>("buckets", 22);
        assertEquals((Integer)22, testing.getValue());
        assertTrue(testing.getKey().equals("buckets"));
    }

    @Test
    public void testSettingNext() {
        Node<Object> testing = new Node<Object>("buckets", 22);
        Node<Object> testingNew = new Node<Object>("animal", "armadillo");
        testing.setNext(testingNew);
        assertTrue(testing.getNext() == testingNew);
        assertSame(testing.next, testingNew);
    }

    @Test
    public void testSettingKey() {
        Node<Integer> testing = new Node<Integer>("buckets", 22);
        testing.setKey("bucketNum");
        assertTrue(testing.key.equals("bucketNum"));
    }

    @Test
    public void testSetValue() {
        Node<String> testing = new Node<String>("name", "blaine");
        testing.setValue("barry");
        assertTrue(testing.value.equals("barry"));
    }

}