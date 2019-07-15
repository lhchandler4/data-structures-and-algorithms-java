package Java.LeftJoin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {
    @Test
    public void testLeftJoin() {
        HashMap<String, String> leftHashMap = new HashMap<>();
        HashMap<String, String> rightHashMap = new HashMap<>();

        leftHashMap.put("fond", "enamored");
        rightHashMap.put("fond", "averse");
        leftHashMap.put("wrath", "anger");
        rightHashMap.put("wrath", "delight");
        leftHashMap.put("diligent", "employed");
        rightHashMap.put("diligent", "idle");
        leftHashMap.put("outfit", "garb");
        rightHashMap.put("guide", "follow");
        leftHashMap.put("guide", "usher");
        rightHashMap.put("flow", "jam");

        ArrayList<ArrayList<String>> testing = new ArrayList<>();
        testing.add(new ArrayList<String>(Arrays.asList("diligent", "employed", "idle")));
        testing.add(new ArrayList<String>(Arrays.asList("outfit", "garb", null)));
        testing.add(new ArrayList<String>(Arrays.asList("wrath", "anger", "delight")));
        testing.add(new ArrayList<String>(Arrays.asList("guide", "usher", "follow")));
        testing.add(new ArrayList<String>(Arrays.asList("fond", "enamored", "averse")));

        assertEquals(testing, LeftJoin.leftJoin(leftHashMap, rightHashMap));
    }

}