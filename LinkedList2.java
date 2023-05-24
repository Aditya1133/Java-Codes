import java.util.*;
public class LinkedList2{
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Print the LinkedList
        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
        
        // Get the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of LinkedList: " + size);

        // Access elements in the LinkedList
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the LinkedList
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after removal: " + linkedList);

        // Add elements at a specific position
        linkedList.add(1, "Grapes");
        System.out.println("LinkedList after adding at position 1: " + linkedList);

        // Check if an element is present in the LinkedList
        boolean containsBanana = linkedList.contains("Banana");
        System.out.println("LinkedList contains 'Banana': " + containsBanana);

        // Clear the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
