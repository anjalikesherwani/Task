// 1. Create a Vector of integers and perform the following operations:

// Add elements 10, 20, 30, and 40 to the Vector.
// Insert 25 at index 2.
// Remove the element at index 3.
// Retrieve the element at index 1.
// Print the size and capacity of the Vector.


import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class vector1 {
    
    public static void main(String[] args) {
        System.out.println("------------1----------------");
        Vector<Integer> vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        System.out.println("vector "+vector);


        vector.add(2,25);
        System.out.println("Insert 25 at index 2:-  "+vector);

        vector.remove(3);
        System.out.println("Remove the element at index 3:- "+vector);

        vector.get(1);
        System.out.println("Retrieve the element at index 1:- "+vector.get(1));

        vector.size();
        System.out.println("vector size:- "+vector.size());

        vector.capacity();
        System.out.println("vector capacity:- "+vector.capacity());


        System.out.println("------------2----------------");

// 2. Create a Vector of strings containing the names of fruits. Perform the following operations:

// Add the fruits "Apple", "Banana", "Cherry", and "Date".
// Iterate over the elements using an Iterator and print them.
// Sort the Vector in alphabetical order.
// Iterate over the elements using an Enumeration and print them.

        Vector<String> vec = new Vector();
        vec.add("Apple");
        vec.add("Cherry");
        vec.add("Banana");
        vec.add("Date");
        System.out.println("vector "+vec);

        System.out.println("iterator vector:- ");
        Iterator<String> iterator = vec.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Sorted vector:- "+vec);

        System.out.println("Enumeration vector:-");
        Enumeration<String> e = vec.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
            }

        
            // 3. Create a Vector of integers and perform the following operations:

            // Add elements 1 through 10 to the Vector.
            // Create a sublist view of elements from index 3 to 7.
            // Modify an element in the sublist.
            // Print both the sublist and the original Vector to show the changes.
            Vector<Integer> vector1 = new Vector();
            System.out.println("------------3----------------");

            vector1.add(1);
            vector1.add(2);
            vector1.add(3);
            vector1.add(4);
            vector1.add(5);
            vector1.add(6);
            vector1.add(7);
            vector1.add(8);
            vector1.add(9);
            vector1.add(10);
            System.out.println("vector "+vector1);
            for(Integer i: vector1 ){
                System.out.println(i);
            }

            List<Integer> sublist = vector1.subList(3, 7);
            System.out.println("sublist "+sublist);
    
            sublist.set(1, 50);
            System.out.println("Modify an element in the sublist:- "+sublist);

            System.out.println("original Vector:- "+ vector1);
            System.out.println("sublist "+sublist);
            


    }
}
