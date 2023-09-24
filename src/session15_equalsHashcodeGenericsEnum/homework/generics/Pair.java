package session15_equalsHashcodeGenericsEnum.homework.generics;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {

        return "{key: " + key + ", value: " + value + "}";
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 30);
        Pair<String, Double> pair2 = new Pair<>("Salary", 50000d);

        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);
    }
}
