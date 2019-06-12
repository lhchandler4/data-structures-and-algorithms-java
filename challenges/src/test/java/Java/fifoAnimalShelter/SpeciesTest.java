package Java.fifoAnimalShelter;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpeciesTest {
    @Test
    //species class only takes in a string as input
    //for the purposes of this code challenge it can only be dog or cat
    public void speciesTest(){
        Species species = new Species("cat");
        assertEquals("cat", species.toString());
    }
}