package Java.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    @Test
    public void testAdd() {
        Hashtable<String> testing = new Hashtable<>();
        testing.add("name", "Chai");
    }

    @Test
    public void testGet() {
        Hashtable<String> testing = new Hashtable<>();
        testing.add("name", "Chai");
        String result = (String)testing.get("name");
        assertTrue(result.equals("Chai"));
    }

    @Test
    public void testGetEmpty(){
        Hashtable<String> testing = new Hashtable<>();
        assertEquals(null, testing.get("Chai"));
    }

    @Test
    public void testGetDoesNotExist(){
        Hashtable<String> testing = new Hashtable<>();
        testing.add("name", "Chai");
        assertEquals(null, testing.get("Will"));
    }

    @Test
    public void testContains() {
        Hashtable<String> testing = new Hashtable<>();
        testing.add("name", "Chai");
        assertTrue(testing.contains("name"));
    }

    @Test
    public void testHashMethod() {
        Hashtable<String> testing = new Hashtable<>();
        assertTrue(testing.hash("Chai") < 1024);
        assertTrue(testing.hash("Likes Twisted Tea") < 1024);
    }

}