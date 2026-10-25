package problem4;

import java.util.*;

public class ListPerformanceComparison {

    private static final int SIZE = 100_000;        // total elements
    private static final int OPERATIONS = 10_000;   // random operations to test

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        System.out.println("---- Performance Comparison ----");

        System.out.println("---- Populate both lists ----");
        for (int i = 0; i < SIZE; i++) {
            //code here
            arrayList.add(i);
            //code here
            linkedList.add(i);
        }

        // 2️⃣ Random insertions and deletions
        testRandomInsertDelete(arrayList, "ArrayList");
        testRandomInsertDelete(linkedList, "LinkedList");

        // 3️⃣ Sequential insertions/deletions at beginning and end
        testSequentialInsertDelete(arrayList, "ArrayList");
        testSequentialInsertDelete(linkedList, "LinkedList");

        // 4️⃣ Random access test
        testRandomAccess(arrayList, "ArrayList");
        testRandomAccess(linkedList, "LinkedList");
    }

    // ------------------------------------------------------------

    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        // insert your code here
        //first we take two random indices within the interval [0, SIZE[ for adding and deleting
        int indx1=random.nextInt(SIZE);
        int indx2=random.nextInt(SIZE);
        //we then take a random element to add to the List
        Integer elem=random.nextInt();
        if ("arraylist".equalsIgnoreCase(name)){
            ArrayList<Integer> array=(ArrayList<Integer>) list; //array and list both refer to the same object in memory
            array.add(indx1, elem);
            array.remove(indx2);
        }
        else if("linkedlist".equalsIgnoreCase(name)){
            LinkedList<Integer> linked=(LinkedList<Integer>) list;
            linked.add(indx1, elem);
            linked.remove(indx2);
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        long start = System.nanoTime();
        int element=(new Random()).nextInt();

        // Insertions at beginning and end

        // add your code here
        if (name.equalsIgnoreCase("arraylist")){
            ArrayList<Integer> array=(ArrayList<Integer>) list;
            array.add(0, element);
            array.add(element);
        }
        else if (name.equalsIgnoreCase("linkedlist")){
            LinkedList<Integer> linked=(LinkedList<Integer>) list;
            linked.addFirst(element);
            linked.addLast(element);
        }

        // Deletions at beginning and end

        // add your code here
        if (name.equalsIgnoreCase("arraylist")){
            ArrayList<Integer> array=(ArrayList<Integer>) list;
            array.remove(0);
            array.remove(SIZE-1);
        }
        else if (name.equalsIgnoreCase("linkedlist")){
            LinkedList<Integer> linked=(LinkedList<Integer>) list;
            linked.removeFirst();
            linked.removeLast();
        }
        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete (start/end): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        long sum = 0;
        // sum of the all elements in the list
       // insert your code here
        if (name.equalsIgnoreCase("arraylist")){
            ArrayList<Integer> array=(ArrayList<Integer>) list;
            for (int i=random.nextInt(SIZE); i<SIZE; i++){
                sum+=array.get(i);
            }
        }
        else if (name.equalsIgnoreCase("linkedlist")){
            LinkedList<Integer> linked=(LinkedList<Integer>) list;
            for (int i=random.nextInt(SIZE); i<SIZE; i++){
                sum+=linked.get(i);
            }
        }
        long end = System.nanoTime();
        System.out.printf("%s - Random access (get): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }
}

/*
Explication of the results:
An ArrayList uses a dynamic array, so random access by index is very fast, with a complexity of O(1). A LinkedList must traverse its nodes to reach a given index, so random access is O(n), which explains why it is much slower.
For insertion and deletion at the beginning or end, LinkedList performs well because it keeps references to the first and last nodes. In contrast, an ArrayList must shift elements when modifying the beginning of the list.
For random insertion and deletion, both are generally O(n): an ArrayList must shift elements, while a LinkedList must traverse the list to find the correct position.
 */