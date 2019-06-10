package Java.stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueuesTest {

    @Test
    public void enqueue_multiple(){
        Queues testing = new Queues();
        testing.enqueue(91);
        testing.enqueue(55);
        testing.enqueue(27);
        assertTrue(testing.getSize() == 3);
    }

    @Test
    public void enqueue_single(){
        Queues testing = new Queues();
        testing.enqueue(91);
        assertTrue(testing.getSize() == 1);
    }

    @Test
    public void dequeue_single(){
        Queues testing = new Queues();
        testing.enqueue(91);
        testing.enqueue(55);
        testing.enqueue(27);
        testing.dequeue();
        assertTrue(testing.getSize() == 2);
    }

    @Test
    public void dequeue_multiple(){
        Queues testing = new Queues();
        testing.enqueue(91);
        testing.enqueue(55);
        testing.enqueue(27);
        testing.dequeue();
        testing.dequeue();
        testing.dequeue();
        assertTrue(testing.getSize() == 0);
    }

    @Test
    public void peek(){
        Queues testing = new Queues();
        testing.enqueue(91);
        testing.enqueue(109);
        assertTrue(testing.peek() == 91);
    }

    @Test
    public void instantiate_empty(){
        Queues testing = new Queues();
        assertTrue(testing.getSize() == 0);
    }

}
