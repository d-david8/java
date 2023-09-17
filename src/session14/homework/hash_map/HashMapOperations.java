package session14.homework.hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        associateKeyValue(map, "one", 1);
        associateKeyValue(map, "two", 2);
        System.out.println("HashMap: " + map);

        System.out.println(countPairs(map));

        HashMap<String, Integer> copyMap = new HashMap<>();
        copyMappings(map, copyMap);
        System.out.println("Copied HashMap: " + copyMap);

        //removeAllMappings(map);
        System.out.println("HashMap after removal: " + map);
        System.out.println("Is HashMap empty? " + isMapEmpty(map));


        HashMap<String, Integer> shallowCopy = getShallowCopy(map);
        System.out.println("Shallow Copy: " + shallowCopy);

        System.out.println("Contains key 'two'? " + containsKey(map, "two"));
        System.out.println("Contains value 3? " + containsValue(map, 3));

        System.out.println("Set view of mappings: " + createEntrySet(map));
        System.out.println("Value for key two: " + getValueForKey(map, "two"));

        System.out.println("Set view of keys: " + getKeySet(map));
        System.out.println("Collection view of values: " + getValues(map));
    }

    // 1. Associate value with a key
    private static void associateKeyValue(HashMap<String, Integer> map, String key, int value) {
        map.put(key, value);
    }

    // 2. Count the number of key-value mappings
    private static int countPairs(HashMap<String, Integer> map) {
        return map.size();
    }

    // 3. Copy mappings to another map
    private static void copyMappings(HashMap<String, Integer> source, HashMap<String, Integer> destination) {
        destination.putAll(source);
    }

    // 4. Remove all mappings
    private static void removeAllMappings(HashMap<String, Integer> map) {
        map.clear();
    }

    // 5. Check if map is empty
    private static boolean isMapEmpty(HashMap<String, Integer> map) {
        return map.isEmpty();
    }

    // 6. Get a shallow copy
    private static HashMap<String, Integer> getShallowCopy(HashMap<String, Integer> map) {
        return new HashMap<>(map);
    }

    // 7. Test if map contains a key
    private static boolean containsKey(HashMap<String, Integer> map, String key) {
        return map.containsKey(key);
    }

    // 8. Test if map contains a value
    private static boolean containsValue(HashMap<String, Integer> map, int value) {
        return map.containsValue(value);
    }

    // 9. Create a set view of the mappings
    private static Set<Map.Entry<String, Integer>> createEntrySet(HashMap<String, Integer> map) {
        return map.entrySet();
    }

    // 10. Get the value for a specified key
    private static int getValueForKey(HashMap<String, Integer> map, String key) {
        return map.get(key);
    }

    // 11. Get a set view of keys
    private static Set<String> getKeySet(HashMap<String, Integer> map) {
        return map.keySet();
    }

    // 12. Get a collection view of values
    private static Collection<Integer> getValues(HashMap<String, Integer> map) {
        return map.values();
    }
}

