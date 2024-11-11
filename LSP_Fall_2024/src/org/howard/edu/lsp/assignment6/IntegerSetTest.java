package org.howard.edu.lsp.assignment6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.howard.edu.lsp.assignment6.IntegerSetException;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegerSetTest {

    @Test
    @DisplayName("Test case for clear method")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty(), "Set should be empty after clear()");
    }

    @Test
    @DisplayName("Test case for length method")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        assertEquals(0, set.length(), "Length of an empty set should be 0");
        set.add(1);
        set.add(2);
        assertEquals(2, set.length(), "Length should be 2 after adding two elements");
    }

    @Test
    @DisplayName("Test case for equals method")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2), "Sets with the same elements should be equal");
        set2.add(3);
        assertFalse(set1.equals(set2), "Sets with different elements should not be equal");
    }

    @Test
    @DisplayName("Test case for contains method")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertTrue(set.contains(1), "Set should contain the element 1");
        assertFalse(set.contains(3), "Set should not contain the element 3");
    }

    @Test
    @DisplayName("Test case for largest method")
    public void testLargest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(10);
        set.add(20);
        set.add(5);
        assertEquals(20, set.largest(), "Largest element should be 20");
    }

    @Test
    @DisplayName("Test exception handling for largest method on empty set")
    public void testLargestException() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, set::largest, "Should throw IntegerSetException if set is empty");
    }

    @Test
    @DisplayName("Test case for smallest method")
    public void testSmallest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(10);
        set.add(20);
        set.add(5);
        assertEquals(5, set.smallest(), "Smallest element should be 5");
    }

    @Test
    @DisplayName("Test exception handling for smallest method on empty set")
    public void testSmallestException() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, set::smallest, "Should throw IntegerSetException if set is empty");
    }

    @Test
    @DisplayName("Test case for add method")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(1);
        assertEquals(1, set.length(), "Set should not add duplicate elements");
    }

    @Test
    @DisplayName("Test case for remove method")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.remove(1);
        assertFalse(set.contains(1), "Set should not contain 1 after removal");
    }

    @Test
    @DisplayName("Test case for union method")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(2);
        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2), "Union should contain elements from both sets");
    }

    @Test
    @DisplayName("Test case for intersect method")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2), "Intersection should contain common elements");
        assertFalse(set1.contains(1), "Intersection should not contain unique elements");
    }

    @Test
    @DisplayName("Test case for diff method")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.diff(set2);
        assertTrue(set1.contains(1), "Difference should contain elements only in the first set");
        assertFalse(set1.contains(2), "Difference should not contain elements in both sets");
    }

    @Test
    @DisplayName("Test case for isEmpty method")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty(), "Set should be empty initially");
        set.add(1);
        assertFalse(set.isEmpty(), "Set should not be empty after adding an element");
    }

    @Test
    @DisplayName("Test case for toString method")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString(), "String representation should match the elements in the set");
    }
}
