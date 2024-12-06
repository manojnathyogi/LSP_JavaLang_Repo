package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    // Test cases for factorial
    @Test
    public void testFactorialPositiveNumbers() {
        assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
        assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    public void testFactorialEdgeCase() {
        assertEquals(1, mathUtils.factorial(1), "Factorial of 1 should be 1");
    }

    @Test
    public void testFactorialNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.factorial(-1);
        });
        assertEquals("Number must be non-negative", exception.getMessage());
    }

    // Test cases for isPrime
    @Test
    public void testIsPrimeTrue() {
        assertTrue(mathUtils.isPrime(7), "7 should be a prime number");
        assertTrue(mathUtils.isPrime(13), "13 should be a prime number");
    }

    @Test
    public void testIsPrimeFalse() {
        assertFalse(mathUtils.isPrime(4), "4 is not a prime number");
        assertFalse(mathUtils.isPrime(1), "1 is not a prime number");
    }

    @Test
    public void testIsPrimeEdgeCases() {
        assertFalse(mathUtils.isPrime(0), "0 is not a prime number");
        assertFalse(mathUtils.isPrime(-5), "Negative numbers are not prime");
    }

    // Test cases for gcd
    @Test
    public void testGcdPositiveNumbers() {
        assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should be 6");
        assertEquals(1, mathUtils.gcd(17, 13), "GCD of 17 and 13 should be 1");
    }

    @Test
    public void testGcdWithZero() {
        assertEquals(5, mathUtils.gcd(5, 0), "GCD of 5 and 0 should be 5");
        assertEquals(7, mathUtils.gcd(0, 7), "GCD of 0 and 7 should be 7");
    }

    @Test
    public void testGcdBothZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.gcd(0, 0);
        });
        assertEquals("Both numbers cannot be zero", exception.getMessage());
    }
}
