package Java.queueWithStacks;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    @Test
    public void test_theEmpties(){
        PseudoQueue testing = new PseudoQueue();
        assertTrue(testing.stackUno.nothingHere());
        assertTrue(testing.stackDos.nothingHere());
    }

    @Test (expected = NullPointerException.class)
    public void testEnqueue_and_deque_multipleValues(){
        PseudoQueue testing = new PseudoQueue();
        testing.enqueue(19);
        testing.enqueue(29);
        testing.enqueue(39);
        assertTrue( testing.dequeue() == 19);
        assertTrue( testing.dequeue() == 29);
        assertTrue( testing.dequeue() == 39);
        testing.dequeue();
    }

    @Test
    public void test_OneValueEnqueue(){
    PseudoQueue testing = new PseudoQueue();
        testing.enqueue(88);
    assertTrue(testing.stackUno.peek() == 88);
    }

    @Test
    public void test_OneValueDequeue(){
        PseudoQueue testing = new PseudoQueue();
        testing.enqueue(109);
        testing.enqueue(55);
        assertTrue(testing.dequeue() == 109);
    }
}