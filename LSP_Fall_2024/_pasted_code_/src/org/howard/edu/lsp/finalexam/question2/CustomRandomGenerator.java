package org.howard.edu.lsp.finalexam.question2;

/**
 * Custom random number generator using a simple algorithm.
 */
public class CustomRandomGenerator implements RandomNumberGenerator {
    private long currentSeed = System.nanoTime(); // Initialize seed with current time
    private static final long MULTIPLIER = 6364136223846793005L; // Multiplier constant for the LCG

    @Override
    public int generate() {
        // Update seed using the linear congruential generator formula
        currentSeed = (currentSeed * MULTIPLIER + 1) % Integer.MAX_VALUE;
        return (int) Math.abs(currentSeed); // Return positive random number
    }
}
