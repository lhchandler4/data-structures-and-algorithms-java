package Java.LeftJoin;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {
    public static ArrayList<Object> leftJoin(HashMap<String, String> leftHashMap, HashMap<String, String> rightHashMap) {
        ArrayList<Object> joinedMaps = new ArrayList<>();

        for (String key: leftHashMap.keySet()) {
            ArrayList<String> temporaryArrayList = new ArrayList<String>();
            //add the keys from the hash map on the left
            temporaryArrayList.add(key);
            //add the values for the keys in the left hash map
            temporaryArrayList.add(leftHashMap.get(key));
            //if the keys for the left hash map are in the right hash map then add those values
            temporaryArrayList.add(rightHashMap.get(key));
            //add the values into the array ist that will be returned
            joinedMaps.add(temporaryArrayList);
        }
        return joinedMaps;
    }
}
