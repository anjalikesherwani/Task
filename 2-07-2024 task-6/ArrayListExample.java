import java.util.ArrayList;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
       
        // Creating a new ArrayList of String type

        ArrayList List = new ArrayList();

        // Adding elements to the ArrayList
        List.add("Hello");
        List.add("20");
        List.add("30");
        List.add(1);
        List.add(2);
        List.add(3);
        List.add("A");
        List.add("AB");
        List.add("ABC");

        
        System.out.println("----------------Displaying the size-----------------");
        System.out.println("Size of arrayList: " + List.size());


        // System.out.println("----------------Adding element at a specific index-----------------");
        // List.add(1, "Element 4");
        // System.out.println("ArrayList after adding an element at index 1: " + List);

        
        // System.out.println("----------------Removing an element-----------------");
        // List.remove(2); // Removing the element at index 2
        // System.out.println("ArrayList after removing the element at index 2: " + List);

        // Displaying the final size of the ArrayList
        System.out.println("----------------Displaying the final size-----------------");
        System.out.println("Final size of arrayList: " + List.size());




//example of arrayList 

         // Creating a new ArrayList of Boolean type
         ArrayList booleanList = new ArrayList();

         // Adding elements to the ArrayList
         booleanList.add(true);
         booleanList.add(false);
         booleanList.add(true);
 
         // Displaying the size of the ArrayList
         System.out.println("Size of booleanList: " + booleanList.size());
 
         // Adding an element at a specific index
         booleanList.add(1, false);
         System.out.println(" after adding an element at index 1: " + booleanList);
 
         // Removing an element from the ArrayList
         booleanList.remove(2); // Removing the element at index 2
         System.out.println(" after removing the element at index 2: " + booleanList);
 
         // Displaying the final size of the ArrayList
         System.out.println("Final size of booleanList: " + booleanList.size());




//real time eeample 



ArrayList<Person> personList = new ArrayList<>();

// Adding elements to the ArrayList
personList.add(new Person("Anjali", 30));
personList.add(new Person("Bunty", 25));
personList.add(new Person("janavi", 35));
personList.add(new Person("Anaya", 40));

// Displaying the size of the ArrayList
System.out.println("Size of personList: " + personList.size());

// Adding an element at a specific index
personList.add(1, new Person("Pawan", 28));
System.out.println(" after adding an element at index 1: " + personList);

// Removing an element from the ArrayList
personList.remove(2); // Removing the element at index 2
System.out.println(" after removing the element at index 2: " + personList);

// Displaying the final size of the ArrayList
System.out.println("Final size of personList: " + personList.size());


    }
}
