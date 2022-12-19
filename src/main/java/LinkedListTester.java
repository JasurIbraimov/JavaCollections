import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        System.out.println(linkedList.size());
        System.out.println(linkedList);

        // Iterators
        LinkedList<String> guitars = new LinkedList<>();
        guitars.add("Gibson");
        guitars.add("Jackson");
        guitars.add("Taylor");
        guitars.add("Fender");

        // Create iterator
        Iterator<String> iterator = guitars.iterator();
        while (iterator.hasNext()) {
            String guitar = iterator.next();
            if (guitar.equals("Taylor")) {
                iterator.remove();
            }
        }
        // Same as foreach loop
        for(String guitar : guitars) {
            System.out.println(guitar);
        }


    }
}
