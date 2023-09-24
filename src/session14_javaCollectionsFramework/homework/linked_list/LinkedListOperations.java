package session14_javaCollectionsFramework.homework.linked_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOperations {

    public static void main(String[] args) {
        LinkedList<String> linkedList = populateList();
//        iterateLinkedList(linkedList);
//        iterateLinkedListStartingAtPosition(linkedList, 1);

//        iterateLinkedListInReverseOrder(linkedList);

//        insertElementAtPosition(linkedList, "Element 4", 1);
//        insertElementAtFirstAndLastPosition(linkedList, "First Element", "Last Element");

//        insertElementAtFront(linkedList, "Front Element");
//        insertElementAtEnd(linkedList, "End Element");

//        insertElementsAtPosition(linkedList,2,new String[]{"Elem1", "Elem2"});
//        getFirstAndLastOccurrence(linkedList,"Element 1");

//        displayElementsAndPositions(linkedList);
//        removeElement(linkedList,"Element 1");

//        removeFirstAndLast(linkedList);
//        removeAllElements(linkedList);

//        swapElements(linkedList, 0, 2);
//        shuffleLinkedList(linkedList);

//        LinkedList<String> newLinkedList = new LinkedList<>();
//        newLinkedList.add("Element 4");
//        joinLinkedLists(linkedList,newLinkedList);
//        System.out.println(cloneLinkedList(linkedList));

//        System.out.println(removeFirstElement(linkedList));
//        System.out.println(getFirstElement(linkedList));

        System.out.println(linkedList);
    }

    private static LinkedList<String> populateList() {
        LinkedList<String> linkedList = new LinkedList<>();
        appendElementToEnd(linkedList, "Element 1");
        appendElementToEnd(linkedList, "Element 2");
        appendElementToEnd(linkedList, "Element 3");
        return linkedList;
    }

    // 1. Append the specified element to the end of a linked list.
    public static void appendElementToEnd(LinkedList<String> list, String element) {
        list.add(element);
    }

    // 2. Iterate through all elements in a linked list.
    public static void iterateLinkedList(LinkedList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    // 3. Iterate through all elements in a linked list starting at the specified position.
    public static void iterateLinkedListStartingAtPosition(LinkedList<String> list, int position) {
        ListIterator<String> iterator = list.listIterator(position);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // 4. Iterate a linked list in reverse order.
    public static void iterateLinkedListInReverseOrder(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    // 5. Insert the specified element at the specified position in the linked list.
    public static void insertElementAtPosition(LinkedList<String> list, String element, int position) {
        list.add(position, element);
    }

    // 6. Insert elements into the linked list at the first and last position.
    public static void insertElementAtFirstAndLastPosition(LinkedList<String> list, String firstElement, String lastElement) {
        list.addFirst(firstElement);
        list.addLast(lastElement);
    }

    // 7. Insert the specified element at the front of a linked list.
    public static void insertElementAtFront(LinkedList<String> list, String element) {
        list.addFirst(element);
    }

    // 8. Insert the specified element at the end of a linked list.
    public static void insertElementAtEnd(LinkedList<String> list, String element) {
        list.addLast(element);
    }

    // 9. Insert some elements at the specified position into a linked list.
    public static void insertElementsAtPosition(LinkedList<String> list, int position, String[] elements) {
        for (int i = 0; i < elements.length; i++) {
            list.add(position + i, elements[i]);
        }
    }

    // 10. Get the first and last occurrence of the specified elements in a linked list.
    public static void getFirstAndLastOccurrence(LinkedList<String> list, String element) {
        int firstOccurrence = list.indexOf(element);
        int lastOccurrence = list.lastIndexOf(element);

        System.out.println("First occurrence of " + element + " " + firstOccurrence);
        System.out.println("Last occurrence of " + element + " " + lastOccurrence);
    }

    // 11. Display the elements and their positions in a linked list.
    public static void displayElementsAndPositions(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator();
        int position = 0;
        while (iterator.hasNext()) {
            System.out.println("Element at position " + position + " " + iterator.next());
            position++;
        }
    }

    // 12. Remove a specified element from a linked list.
    public static void removeElement(LinkedList<String> list, String element) {
        list.remove(element);
    }

    // 13. Remove first and last element from a linked list.
    public static void removeFirstAndLast(LinkedList<String> list) {
        list.removeFirst();
        list.removeLast();
    }

    // 14. Remove all the elements from a linked list.
    public static void removeAllElements(LinkedList<String> list) {
        list.clear();
    }

    // 15. Swap two elements in a linked list.
    public static void swapElements(LinkedList<String> list, int index1, int index2) {
        Collections.swap(list, index1, index2);
    }

    // 16. Shuffle the elements in a linked list.
    public static void shuffleLinkedList(LinkedList<String> list) {
        Collections.shuffle(list);
    }

    // 17. Join two linked lists.
    public static void joinLinkedLists(LinkedList<String> list1, LinkedList<String> list2) {
        list1.addAll(list2);
    }

    // 18. Clone a linked list to another linked list.
    public static LinkedList<String> cloneLinkedList(LinkedList<String> list) {
        return new LinkedList<>(list);
    }

    // 19. Remove and return the first element of a linked list.
    public static String removeFirstElement(LinkedList<String> list) {
        return list.poll();
    }

    // 20. Retrieve but does not remove, the first element of a linked list.
    public static String getFirstElement(LinkedList<String> list) {
        return list.peek();
    }
}
