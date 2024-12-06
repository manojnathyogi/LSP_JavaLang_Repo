package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Random number generator using Java's built-in Random class.
 */
public class BuiltInRandomGenerator implements RandomNumberGenerator {
    private final Random random = new Random();

    @Override
    public int generate() {
        return random.nextInt(Integer.MAX_VALUE) + 1; // Ensures positive integers
    }
}
