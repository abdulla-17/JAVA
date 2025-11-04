import java.util.LinkedList;

public class JavaLinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        
        list.add("Apple");
        list.add("Banana");
        list.addLast("Mango"); 

        System.out.println("LinkedList: " + list);

        
        list.addFirst("Kiwi");
        System.out.println("After addFirst: " + list);

        
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Remove elements
        list.remove("Banana");
        list.removeFirst();
        list.removeLast();
        
        System.out.println("After removals: " + list);

        // Iterate through the list
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
