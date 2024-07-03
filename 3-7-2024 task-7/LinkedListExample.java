/*Define a Custom Class:

Write a Java class named Person with two properties: name (a String) and age (an int).
Include a constructor to initialize these properties.
Override the toString method to return a string representation in the format "name (age)".
Creating and Adding Elements to LinkedList:

Create two LinkedList instances named list1 and list2 to store Person objects.
Add the following Person objects to list1:
Person("Anjali", 30)
Person("Pushpanjali", 25)
Person("Piyush", 35)
Add the following Person objects to list2:
Person("Trapti", 40)
Person("Manorama", 28)
Person("Annapurna", 33)
Displaying LinkedLists:

Write code to display the contents of both list1 and list2.
Merging LinkedLists:

Merge list2 into list1.
Sorting the LinkedList:

Sort the merged LinkedList by age using a custom comparator.
Reversing the LinkedList:

Reverse the sorted LinkedList.

Iterate through the LinkedList using an Iterator and print each Person object.
Checking for Containment:

Check if the LinkedList contains a Person object with the name "Anjali" and age 30.
Removing Elements Based on Condition:

Remove all Person objects from the LinkedList where the age is less than 30.
Converting to Array:

Convert the LinkedList to an array of Person objects and print each element in the array.
Clearing the LinkedList:

Clear all elements from the LinkedList.*/

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class LinkedListExample {

    public static void main(String[] args) {

          // Creating and Adding Elements to LinkedList
          LinkedList<Person> list1 = new LinkedList<>();
          list1.add(new Person("Anjali", 30));
          list1.add(new Person("Pushpanjali", 25));
          list1.add(new Person("Piyush", 35));
  
          LinkedList<Person> list2 = new LinkedList<>();
          list2.add(new Person("Trapti", 40));
          list2.add(new Person("Manorama", 28));
          list2.add(new Person("Annapurna", 33));
  
          // Displaying LinkedLists
          System.out.println("----------------Displaying LinkedLists-----------------");
          System.out.println("List1:");
          for (Person person : list1) {
              System.out.println(person);
          }
  
          System.out.println("List2:");
          for (Person person : list2) {
              System.out.println(person);
          }
  
          // Merging LinkedLists
          list1.addAll(list2);
  
          // Sorting the LinkedList by age
          list1.sort(Comparator.comparingInt(Person::getAge));
  
          // Reversing the LinkedList
          Collections.reverse(list1);
  
          // Iterating through the LinkedList using an Iterator
          System.out.println("------------Merged, Sorted, and Reversed List-------------------");
          Iterator<Person> iterator = list1.iterator();
          while (iterator.hasNext()) {
              System.out.println(iterator.next());
          }
  
          // Checking for Containment
          Person searchPerson = new Person("Anjali", 30);
          boolean contains = list1.stream().anyMatch(p -> p.getName().equals(searchPerson.getName()) && p.getAge() == searchPerson.getAge());
          System.out.println("List contains Anjali (30): " + contains);
  
          // Removing Elements Based on Condition
          System.out.println("-------------Removing Elements Based on Condition-----------");
          list1.removeIf(person -> person.getAge() < 30);
  
          // Converting to Array
          Person[] personArray = list1.toArray(new Person[0]);
          System.out.println("-------------LinkedList as an Array-----------");
          for (Person person : personArray) {
              System.out.println(person);
          }
  
        //   Clearing the LinkedList
          list1.clear();
          System.out.println("Cleared List1: " + list1);
        }

    }
