package session14.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Integer> myMap = initializeMap();
        System.out.println(retrieveValue(myMap, "one"));

        updateMap(myMap, "three", 10);
        System.out.println(retrieveValue(myMap, "three"));

        removeEntry(myMap,"three");
        System.out.println(myMap);

    }

    private static Map<String, Integer> initializeMap() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        return myMap;
    }

    private static int retrieveValue(Map<String, Integer> myMap, String key) {
        return myMap.get(key);
    }

    private static void updateMap(Map<String, Integer> myMap, String key, int value) {
        myMap.put(key, value);
    }

    private static void removeEntry(Map<String, Integer> map, String key) {
        map.remove(key);
    }

}
