package session14.homework.hash_set;

import java.util.*;

public class HashSetOperations {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = populateHashset();
        appendElement(hashSet, 20);
        iterateHashSet(hashSet);

        System.out.println(getHashSetSize(hashSet));
        emptyHashSet(hashSet);

        System.out.println(isHashSetEmpty(hashSet));
        HashSet<Integer> newHashSet = cloneHashSet(hashSet);
        System.out.println(newHashSet);

        System.out.println(Arrays.toString(convertHashSetToArray(hashSet)));
        System.out.println(convertHashSetToTreeSet(hashSet));

        System.out.println(convertHashSetToList(hashSet));
        HashSet<Integer> newIntegerHashSet = new HashSet<>(hashSet);
        System.out.println(areHashSetsEquals(hashSet, newIntegerHashSet));

        newIntegerHashSet.add(5);
        System.out.println(retainCommonElements(hashSet, newIntegerHashSet));
        removeAllElements(hashSet);

        System.out.println(hashSet);

    }

    private static HashSet<Integer> populateHashset() {
        HashSet<Integer> hashSet = new HashSet<>();
        appendElement(hashSet, 5);
        appendElement(hashSet, 10);
        appendElement(hashSet, 15);
        return hashSet;
    }

    // 1. Append the specified element to the end of a hash set.
    public static void appendElement(HashSet<Integer> set, int element) {
        set.add(element);
    }

    // 2. Iterate through all elements in a hash set.
    public static void iterateHashSet(HashSet<Integer> set) {
        for (int element : set) {
            System.out.println(element);
        }
    }

    // 3. Get the number of elements in a hash set.
    public static int getHashSetSize(HashSet<Integer> set) {
        return set.size();
    }

    // 4. Empty a hash set.
    public static void emptyHashSet(HashSet<Integer> set) {
        set.clear();
    }

    // 5. Test if a hash set is empty or not.
    public static boolean isHashSetEmpty(HashSet<Integer> set) {
        return set.isEmpty();
    }

    // 6. Clone a hash set to another hash set.
    public static HashSet<Integer> cloneHashSet(HashSet<Integer> set) {
        return new HashSet<>(set);
    }

    // 7. Convert a hash set to an array.
    public static Integer[] convertHashSetToArray(HashSet<Integer> set) {
        return set.toArray(new Integer[0]);
    }

    // 8. Convert a hash set to a tree set.
    public static TreeSet<Integer> convertHashSetToTreeSet(HashSet<Integer> set) {
        return new TreeSet<>(set);
    }

    // 9. Convert a hash set to a List/ArrayList.
    public static List<Integer> convertHashSetToList(HashSet<Integer> set) {
        return new ArrayList<>(set);
    }

    // 10. Compare two hash sets.
    public static boolean areHashSetsEquals(HashSet<Integer> set1, HashSet<Integer> set2) {
        return set1.equals(set2);
    }

    // 11. Compare two sets and retain elements which are the same in both sets.
    public static HashSet<Integer> retainCommonElements(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> retainedSet = new HashSet<>(set1);
        retainedSet.retainAll(set2);
        return retainedSet;
    }

    // 12. Remove all elements from a hash set.
    public static void removeAllElements(HashSet<Integer> set) {
        set.clear();
    }
}
