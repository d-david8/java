package session15.homework.equals_hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 * Create a generic repository class for storing objects. The repository should use a HashMap internally.
 * Override equals and hashcode methods to ensure the correct behavior of the repository.
 * */
public class Repository<T> {
    private final Map<String, T> repositoryData;

    public Repository() {
        repositoryData = new HashMap<>();
    }

    public void add(String key, T object) {
        repositoryData.put(key, object);
    }

    public T get(String key) {
        return repositoryData.get(key);
    }

    public void remove(String key) {
        repositoryData.remove(key);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Repository<?> repository = (Repository<?>) obj;
        return Objects.equals(repositoryData, repository.repositoryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryData);
    }

    public static void main(String[] args) {

        Repository<String> stringRepository1 = new Repository<>();
        stringRepository1.add("key1", "Value 1");
        stringRepository1.add("key2", "Value 2");

        Repository<String> stringRepository2 = new Repository<>();
        stringRepository2.add("key1", "Value 1");
        stringRepository2.add("key2", "Value 2");

        Repository<Integer> integerRepository = new Repository<>();
        integerRepository.add("key1", 42);
        integerRepository.add("key2", 99);

        System.out.println(stringRepository1.equals(integerRepository));
        System.out.println(stringRepository1.equals(stringRepository2));

        System.out.println("String repository 1 hashcode: " + stringRepository1.hashCode());
        System.out.println("String repository 2 hashcode: " + stringRepository2.hashCode());
        System.out.println("Integer repository 1 hashcode: " + integerRepository.hashCode());
    }
}
