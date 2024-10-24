package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment5.IntegerSet;
import org.howard.edu.lsp.assignment5.IntegerSetException;

/**
 * The Driver class is used to demonstrate and test the functionality of the IntegerSet class.
 * This class contains the main method which acts as the entry point for the program.
 */
public class Driver { 
    /**
     * The main method where the program execution begins.
     * This method will create IntegerSet objects and perform various operations
     * to demonstrate the capabilities of the IntegerSet class.
     *
     * @param args Command line arguments passed to the program (not used in this program).
     */
    public static void main(String[] args) {
        // Test default constructor
        IntegerSet set1 = new IntegerSet();
        System.out.println("Initial state of Set1 (empty): " + set1);

        // Test add and toString
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("State of Set1 after adding 1, 2, 3: " + set1);

        // Test contains
        System.out.println("Does Set1 contain 2? " + set1.contains(2));
        System.out.println("Does Set1 contain 4? " + set1.contains(4));

        // Test remove
        System.out.println("State of Set1 before removing 2: " + set1);
        set1.remove(2);
        System.out.println("State of Set1 after removing 2: " + set1);

        // Test largest and smallest with exception handling
        try {
            System.out.println("Largest element in Set1: " + set1.largest());
            System.out.println("Smallest element in Set1: " + set1.smallest());
        } catch (IntegerSetException e) {
            System.out.println(e.getMessage());
        }

        // Test union
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("\nState of Set2: " + set2);
        System.out.println("State of Set1 before union: " + set1);
        set1.union(set2);
        System.out.println("State of Set1 after union with Set2: " + set1);

        // Reset set1 for further tests
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("\nState of Set1 before intersection: " + set1);
        System.out.println("State of Set2 before intersection: " + set2);

        // Test intersect
        set1.intersect(set2);
        System.out.println("State of Set1 after intersection with Set2: " + set1);

        // Reset set1 for further tests
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("\nState of Set1 before difference: " + set1);
        System.out.println("State of Set2 before difference: " + set2);

        // Test diff
        set1.diff(set2);
        System.out.println("State of Set1 after difference with Set2: " + set1);

        // Reset set1 for further tests
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("\nState of Set1 before complement: " + set1);
        System.out.println("State of Set2 before complement: " + set2);

        // Test complement
        set1.complement(set2);
        System.out.println("State of Set1 after complement with Set2: " + set1);

        // Test isEmpty
        System.out.println("\nIs Set1 empty? " + set1.isEmpty());

        // Test clear
        set1.clear();
        System.out.println("State of Set1 after clear: " + set1);

        // Test equals
        set1.add(1);
        set1.add(2);
        IntegerSet set3 = new IntegerSet();
        set3.add(2);
        set3.add(1);
        System.out.println("\nState of Set1: " + set1);
        System.out.println("State of Set3: " + set3);
        System.out.println("Does Set1 equal Set3? " + set1.equals(set3));
    }
}
