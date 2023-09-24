package session14_javaCollectionsFramework.homework.tree_map;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapOperations {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        associateKeyValue(treeMap, 1, "One");
        associateKeyValue(treeMap, 2, "Two");
        associateKeyValue(treeMap, 3, "Three");
        System.out.println("TreeMap: " + treeMap);

        TreeMap<Integer, String> copyMap = new TreeMap<>();
        copyTreeMapContent(treeMap, copyMap);
        System.out.println("Copied TreeMap: " + copyMap);

        System.out.println("Key 2 found: " + searchForKey(treeMap, 2));
        System.out.println("Value Two found: " + searchForValue(treeMap, "Two"));

        System.out.println("All Keys: " + getAllKeys(treeMap));
        //deleteAllElements(treeMap);

        sortKeysByComparator(treeMap);
        getGreatestAndLeastKeyValues(treeMap);
        getFirstAndLastKeys(treeMap);

        getReverseOrderKeys(treeMap);
        System.out.println(getKeyValuesLessThanOrEqual(treeMap, 2));
        System.out.println(getGreatestKeyLessThanOrEqual(treeMap, 2));

        getKeysStrictlyLessThan(treeMap, 3);
        getKeysLessThanOrEqual(treeMap, 2);

        System.out.println(getLeastKeyStrictlyGreater(treeMap, 2));
        System.out.println(getKeyValueGreatestKeyLessThan(treeMap, 2));
        System.out.println(getGreatestKeyStrictlyLessThan(treeMap, 2));

        System.out.println(treeMap);
    }

    // 1. Associate value with a key
    private static void associateKeyValue(TreeMap<Integer, String> map, int key, String value) {
        map.put(key, value);
    }

    // 2. Copy content to another TreeMap
    private static void copyTreeMapContent(TreeMap<Integer, String> source, TreeMap<Integer, String> destination) {
        destination.putAll(source);
    }

    // 3. Search for a key
    private static boolean searchForKey(TreeMap<Integer, String> map, int key) {
        return map.containsKey(key);
    }

    // 4. Search for a value
    private static boolean searchForValue(TreeMap<Integer, String> map, String value) {
        return map.containsValue(value);
    }

    // 5. Get all keys
    private static Set<Integer> getAllKeys(TreeMap<Integer, String> map) {
        return map.keySet();
    }

    // 6. Delete all elements
    private static void deleteAllElements(TreeMap<Integer, String> map) {
        map.clear();
    }

    // 7. Sort keys by using comparator
    private static void sortKeysByComparator(TreeMap<Integer, String> map) {
        TreeMap<Integer, String> sortedMap = new TreeMap<>((o1, o2) -> o2 - o1);
        sortedMap.putAll(map);
    }

    // 8. Get greatest and least keys with values
    private static void getGreatestAndLeastKeyValues(TreeMap<Integer, String> map) {
        int leastKey = map.firstKey();
        String leastValue = map.get(leastKey);

        int greatestKey = map.lastKey();
        String greatestValue = map.get(greatestKey);

        System.out.println("Least key: " + leastKey + ", value: " + leastValue);
        System.out.println("Greatest key: " + greatestKey + ", value: " + greatestValue);
    }

    // 9. Get the first and last keys
    private static void getFirstAndLastKeys(TreeMap<Integer, String> map) {
        int firstKey = map.firstKey();
        int lastKey = map.lastKey();

        System.out.println("First key: " + firstKey);
        System.out.println("Last key: " + lastKey);
    }

    // 10. Get a reverse order view of keys
    private static void getReverseOrderKeys(TreeMap<Integer, String> map) {
        NavigableSet<Integer> reverseKeys = map.descendingKeySet();
        System.out.println("Reverse order keys: " + reverseKeys);
    }

    // 11. Get key-value mapping associated with the greatest key less than or equal to a given key
    private static String getKeyValuesLessThanOrEqual(TreeMap<Integer, String> map, int key) {
        return map.floorEntry(key).getValue();

    }

    // 12. Get the greatest key less than or equal to the given key
    private static int getGreatestKeyLessThanOrEqual(TreeMap<Integer, String> map, int key) {
        return map.floorKey(key);
    }

    // 13. Get the portion of keys strictly less than a given key
    private static void getKeysStrictlyLessThan(TreeMap<Integer, String> map, int key) {
        NavigableMap<Integer, String> subMap = map.headMap(key, false);
        System.out.println("Keys strictly less than " + key + ": " + subMap.keySet());
    }

    // 14. Get the portion of keys less than or equal to a given key
    private static void getKeysLessThanOrEqual(TreeMap<Integer, String> map, int key) {
        NavigableMap<Integer, String> subMap = map.headMap(key, true);
        System.out.println("Keys less than or equal to " + key + ": " + subMap.keySet());
    }

    // 15. Get the least key strictly greater than the given key
    private static int getLeastKeyStrictlyGreater(TreeMap<Integer, String> map, int key) {
        return map.higherKey(key);
    }

    // 16. Get key-value mapping associated with the greatest key strictly less than the given key
    private static String getKeyValueGreatestKeyLessThan(TreeMap<Integer, String> map, int key) {
        return map.lowerEntry(key).getValue();
    }

    // 17. Get the greatest key strictly less than the given key
    private static int getGreatestKeyStrictlyLessThan(TreeMap<Integer, String> map, int key) {
        return map.lowerKey(key);
    }
}

