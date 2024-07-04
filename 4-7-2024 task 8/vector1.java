// 1. Create a Vector of integers and perform the following operations:

// Add elements 10, 20, 30, and 40 to the Vector.
// Insert 25 at index 2.
// Remove the element at index 3.
// Retrieve the element at index 1.
// Print the size and capacity of the Vector.


import java.util.Vector;

public class vector1 {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        System.out.println(vector);


        vector.add(2,25);
        System.out.println(vector);

        vector.remove(3);
        System.out.println(vector);

        vector.get(1);
        System.out.println(vector.get(1));

        vector.size();
        System.out.println(vector.size());

        vector.capacity();
        System.out.println(vector.capacity());
    }
}
