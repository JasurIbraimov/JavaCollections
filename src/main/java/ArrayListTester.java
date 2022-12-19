import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class ArrayListTester {
    public static void main(String[] args) {

        // Default Constructor - with default capacity - 10
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        arrayList.add(10);
        System.out.println(arrayList.size());
        System.out.println(arrayList);


        // Constructor with capacity
        ArrayList<Integer> arrayList2 = new ArrayList<>(100);
        System.out.println("Initial size: " + arrayList2.size());
        for (int i  = 1; i < 101; i++) {
            arrayList2.add(i);
        }
        System.out.println("New size: " + arrayList2.size());
        System.out.println(arrayList2.get(0));
        System.out.println(arrayList2);

        // Set a new capacity
        arrayList2.ensureCapacity(200);

        // Trim array list capacity to its size
        arrayList2.trimToSize();

        // Constructor with another collection
        ArrayList<Integer> arrayList3 = new ArrayList<>(arrayList2);
        System.out.println(arrayList3);


        // Overloaded .add method (adds with defined position - index - of element )
        arrayList2.add(99, 555);
        System.out.println(arrayList2);

        // Method addAll - adds all elements from another collection
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);

        // addAll from Collections class
        // Array of integers
        Integer[] integers = {1, 2000, 3};
        Collections.addAll(arrayList4, integers);
        System.out.println(arrayList4);

        // Remove element from arrayList
        arrayList4.remove(2);
        System.out.println(arrayList4);
        // Remove all elements of another collection
        // arrayList4.removeAll(arrayList2);
        System.out.println(arrayList4);
        // Remove with predicate
        arrayList4.removeIf(integer -> integer >= 20 && integer <= 40);
        System.out.println(arrayList4);

    }
}
