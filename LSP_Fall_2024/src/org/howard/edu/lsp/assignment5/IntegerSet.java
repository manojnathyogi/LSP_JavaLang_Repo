package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of unique integers and provides common set operations 
 * like union, intersection, and difference. It ensures no duplicate values.
 */
public class IntegerSet {
    // Stores elements of the integer set in a list
    private List<Integer> elements;

    /**
     * Default constructor initializing the set as an empty list.
     */
    public IntegerSet() {
        elements = new ArrayList<>();
    }

    /**
     * Constructor to initialize the set with given integers.
     * @param initialElements List of integers to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> initialElements) {
        elements = new ArrayList<>(initialElements);
    }

    /**
     * Clears all elements from the set, leaving it empty.
     */
    public void clear() {
        elements.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return Size of the set.
     */
    public int length() {
        return elements.size();
    }

    /**
     * Checks if the current set is equal to another set.
     * @param obj The object to compare with this set.
     * @return true if both sets contain the same elements, otherwise false.
     */
    public boolean equals(Object obj) {
        if (this == obj) return true;  // If both references point to the same object
        if (!(obj instanceof IntegerSet)) return false;  // Check if the object is an IntegerSet
        IntegerSet otherSet = (IntegerSet) obj;
        return elements.containsAll(otherSet.elements) && otherSet.elements.containsAll(elements);
    }

    /**
     * Checks if a specific integer is present in the set.
     * @param value The integer to check.
     * @return true if the integer is found, otherwise false.
     */
    public boolean contains(int value) {
        return elements.contains(value);
    }

    /**
     * Finds the largest element in the set.
     * @return The largest integer in the set.
     * @throws IntegerSetException if the set is empty.
     */
    public int largest() throws IntegerSetException {
        if (elements.isEmpty()) throw new IntegerSetException("Set is empty");
        return elements.stream().max(Integer::compare).get();
    }

    /**
     * Finds the smallest element in the set.
     * @return The smallest integer in the set.
     * @throws IntegerSetException if the set is empty.
     */
    public int smallest() throws IntegerSetException {
        if (elements.isEmpty()) throw new IntegerSetException("Set is empty");
        return elements.stream().min(Integer::compare).get();
    }

    /**
     * Adds a new integer to the set if it's not already present.
     * @param item The integer to be added.
     */
    public void add(int item) {
        if (!elements.contains(item)) {
            elements.add(item);
        }
    }

    /**
     * Removes an integer from the set if it exists.
     * @param item The integer to be removed.
     */
    public void remove(int item) {
        elements.remove(Integer.valueOf(item));
    }

    /**
     * Performs the union of this set with another set.
     * @param otherSet The other set to combine with this set.
     */
    public void union(IntegerSet otherSet) {
        for (int element : otherSet.elements) {
            if (!elements.contains(element)) {
                elements.add(element);
            }
        }
    }

    /**
     * Finds the intersection of this set with another set.
     * @param otherSet The other set to intersect with.
     */
    public void intersect(IntegerSet otherSet) {
        elements.retainAll(otherSet.elements);
    }

    /**
     * Finds the difference between this set and another set.
     * @param otherSet The set to subtract from this set.
     */
    public void diff(IntegerSet otherSet) {
        elements.removeAll(otherSet.elements);
    }

    /**
     * Updates this set to its complement relative to another set.
     * @param otherSet The set to compare for the complement.
     */
    public void complement(IntegerSet otherSet) {
        List<Integer> complement = new ArrayList<>(elements);
        complement.removeAll(otherSet.elements);
        elements = complement;
    }

    /**
     * Checks if the set is empty.
     * @return true if the set is empty, otherwise false.
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * @return A string showing the elements of the set.
     */
    public String toString() {
        return elements.toString();
    }
}
