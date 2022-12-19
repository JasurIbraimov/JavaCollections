import java.util.ArrayList;

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


    }
}
