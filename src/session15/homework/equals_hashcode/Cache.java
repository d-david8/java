package session15.homework.equals_hashcode;

import java.util.HashMap;
import java.util.Objects;

/*
 * Simulate a cache where objects are stored. Objects with the same hashcode should overwrite existing
 * objects in the cache. Consider how would you design the hashcode method to facilitate this.
 * */
public class Cache<K, V> {
    private final HashMap<K, V> cacheMap;

    public Cache() {
        cacheMap = new HashMap<>();
    }

    public void put(K key, V value) {
        cacheMap.put(key, value);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (K key : cacheMap.keySet()) {
            stringBuilder.append(key).append(" ").append(cacheMap.get(key)).append("\n");
        }
        return stringBuilder.toString();
    }
}

class CachedObject {
    private final String key;
    private final String value;

    public CachedObject(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CachedObject cachedObject = (CachedObject) obj;
        return Objects.equals(key, cachedObject.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "CachedObject{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cache<String, CachedObject> cache = new Cache<>();

        // Create and put objects in the cache
        CachedObject obj1 = new CachedObject("key1", "value1");
        CachedObject obj2 = new CachedObject("key2", "value2");
        CachedObject obj3 = new CachedObject("key1", "updatedValue");

        cache.put(obj1.getKey(), obj1);
        cache.put(obj2.getKey(), obj2);

        cache.put(obj3.getKey(), obj3);

        System.out.println(cache.toString());
    }
}
