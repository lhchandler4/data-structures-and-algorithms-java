package Java.fifoAnimalShelter;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalShelterTest {
//whose been waiting the longest (can be used as the stretch goal I suppose)
    @Test
    public void theLongestWaiting(){
        AnimalShelter testing = new AnimalShelter();
        testing.enqueue(new Species("cat"));
        testing.enqueue(new Species("cat"));
        testing.enqueue(new Species("dog"));
        testing.enqueue(new Species("dog"));
        assertEquals("cat", testing.getTheFront().data.toString());
    }

    @Test(expected = NullPointerException.class)
    public void noPref(){
        AnimalShelter testing = new AnimalShelter();
        testing.enqueue(new Species("cat"));
        testing.enqueue(new Species("cat"));
        testing.enqueue(new Species("dog"));
        testing.enqueue(new Species("dog"));
        assertEquals(null, testing.dequeue("").toString());
    }

    @Test
    public void dequeueTest(){
        AnimalShelter testing = new AnimalShelter();
        testing.enqueue(new Species("cat"));
        testing.enqueue(new Species("cat"));
        testing.enqueue(new Species("dog"));
        testing.enqueue(new Species("dog"));
        assertEquals("cat", testing.dequeue("cat").toString());
        assertEquals( 3, testing.getCounter());
    }

    @Test
    public void dequeueTestAgain(){
        AnimalShelter testing = new AnimalShelter();
        testing.enqueue(new Species("cat"));
        testing.enqueue(new Species("dog"));
        testing.enqueue(new Species("cat"));
        testing.enqueue(new Species("dog"));
        assertEquals("cat", testing.dequeue("cat").toString());
        assertEquals("dog", testing.dequeue("dog").toString());
        assertEquals( 2, testing.getCounter());
    }

    @Test
    public void enqueueTest(){
        AnimalShelter testing = new AnimalShelter();
        testing.enqueue(new Species("cat"));
        testing.enqueue(new Species("cat"));
        testing.enqueue(new Species("dog"));
        assertEquals(3, testing.getCounter());
    }

    @Test
    public void nothingHere(){
        AnimalShelter testing = new AnimalShelter();
        assertTrue( testing.nothingHere());
    }
}