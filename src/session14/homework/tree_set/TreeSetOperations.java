package session14.homework.tree_set;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetOperations {

    public static void main(String[] args) {
        TreeSet<String> colorSet = populateTreeSet();
//        System.out.println("TreeSet: " + colorSet);
//        iterateTreeSet(colorSet);

//        TreeSet<String> anotherSet = new TreeSet<>();
//        addAllElements(colorSet, anotherSet);
//        System.out.println(anotherSet);

//        createReverseOrderView(colorSet);
//        getFirstAndLastElements(colorSet);

//        System.out.println(cloneTreeSet(colorSet));
//        System.out.println(getNumberOfElements(colorSet));

//        TreeSet<String> newSet = new TreeSet<>(colorSet);
//        System.out.println(areSetsEquals(colorSet,newSet));

//        TreeSet<Integer> numSet = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
//        System.out.println(findNumbersLessThan(numSet, 7));

//        System.out.println(getGreaterOrEqualElement(colorSet, "Green"));
//        System.out.println(getLessOrEqualElement(colorSet, "Orange"));
//        System.out.println(getStrictlyGreaterElement(colorSet, "Green"));
//        System.out.println(getStrictlyLessElement(colorSet, "Green"));
//
//        System.out.println(retrieveAndRemoveFirstElement(colorSet));
//        System.out.println(retrieveAndRemoveLastElement(colorSet));
//        removeElement(colorSet, "Red");

        System.out.println("TreeSet: " + colorSet);
    }

    // 1. Create a new tree set and populate it with values
    private static TreeSet<String> populateTreeSet() {
        TreeSet<String> colorSet = new TreeSet<>();
        colorSet.add("Red");
        colorSet.add("Green");
        colorSet.add("Blue");
        colorSet.add("Yellow");
        return colorSet;
    }

    // 2. Iterate through all elements in a tree set
    private static void iterateTreeSet(TreeSet<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }

    // 3. Add elements from one tree set to another
    private static void addAllElements(TreeSet<String> source, TreeSet<String> destination) {
        destination.addAll(source);
    }

    // 4. Create a reverse order view
    private static void createReverseOrderView(TreeSet<String> set) {
        TreeSet<String> reverseSet = new TreeSet<>(Collections.reverseOrder());
        reverseSet.addAll(set);
    }

    // 5. Get first and last elements
    private static void getFirstAndLastElements(TreeSet<String> set) {
        String first = set.first();
        String last = set.last();
        System.out.println("First Element: " + first);
        System.out.println("Last Element: " + last);
    }

    // 6. Clone a tree set
    private static TreeSet<String> cloneTreeSet(TreeSet<String> set) {
        return new TreeSet<>(set);
    }

    // 7. Get the number of elements
    private static int getNumberOfElements(TreeSet<String> set) {
        return set.size();
    }

    // 8. Compare two sets
    public static boolean areSetsEquals(TreeSet<String> firstSet, TreeSet<String> secondSet) {
        return firstSet.equals(secondSet);
    }

    // 9. Find numbers less than a given value in a tree set
    private static TreeSet<Integer> findNumbersLessThan(TreeSet<Integer> set, int value) {
        return new TreeSet<>(set.headSet(value));
    }

    // 10. Get element greater than or equal to a given element
    private static String getGreaterOrEqualElement(TreeSet<String> set, String element) {
        return set.ceiling(element);
    }

    // 11. Get element less than or equal to a given element
    private static String getLessOrEqualElement(TreeSet<String> set, String element) {
        return set.floor(element);
    }

    // 12. Get element strictly greater than a given element
    private static String getStrictlyGreaterElement(TreeSet<String> set, String element) {
        return set.higher(element);
    }

    // 13. Get element strictly less than a given element
    private static String getStrictlyLessElement(TreeSet<String> set, String element) {
        return set.lower(element);
    }

    // 14. Retrieve and remove the first element
    private static String retrieveAndRemoveFirstElement(TreeSet<String> set) {
        return set.pollFirst();
    }

    // 15. Retrieve and remove the last element
    private static String retrieveAndRemoveLastElement(TreeSet<String> set) {
        return set.pollLast();
    }

    // 16. Remove a given element
    private static void removeElement(TreeSet<String> set, String element) {
        set.remove(element);
    }
}

