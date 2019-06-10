package Java.stacksandqueues;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StacksTest {
    @Test
    public void push_multiple(){
        Stacks testing = new Stacks();
        testing.push(91);
        testing.push(55);
        testing.push(27);
        assertTrue(testing.getSize() == 3);
    }
    @Test (expected = EmptyStackException.class)
    public void test_empty(){
        Stacks testing = new Stacks();
        testing.pop();
    }

    @Test
    public void push_single(){
        Stacks testing = new Stacks();
        testing.push(91);
        assertTrue(testing.getSize() == 1);
    }

    @Test
    public void pop_single(){
        Stacks testing = new Stacks();
        testing.push(91);
        testing.push(55);
        testing.push(27);
        testing.pop();
        assertTrue(testing.getSize() == 2);
    }

    @Test
    public void pop_multiple(){
        Stacks testing = new Stacks();
        testing.push(91);
        testing.push(55);
        testing.push(27);
        testing.pop();
        testing.pop();
        testing.pop();
        assertTrue(testing.getSize() == 0);
    }

    @Test
    public void peek(){
        Stacks testing = new Stacks();
        testing.push(91);
        testing.push(109);
        assertTrue(testing.peek() == 109);
    }

    @Test
    public void instantiateEmptyStack(){
        Stacks testing = new Stacks();
        assertTrue(testing.getSize() == 0);
    }
}
