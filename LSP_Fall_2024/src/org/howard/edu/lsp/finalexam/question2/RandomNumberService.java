package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberService {
    private static RandomNumberService instance; // Singleton instance
    private RandomNumberGenerator strategy; // Strategy for generating random numbers

    private RandomNumberService() {
        // Private constructor for Singleton
    }

    /**
     * Returns the singleton instance of RandomNumberService.
     *
     * @return the singleton instance of RandomNumberService
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for generating random numbers.
     *
     * @param strategy the strategy to set
     */
    public void setStrategy(RandomNumberGenerator strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the selected strategy.
     *
     * @return a positive random integer
     * @throws IllegalStateException if no strategy is set
     */
    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Random number generator strategy not set");
        }
        return strategy.generate();
    }
}
