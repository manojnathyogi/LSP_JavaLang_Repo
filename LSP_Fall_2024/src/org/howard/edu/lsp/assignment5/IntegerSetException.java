package org.howard.edu.lsp.assignment5;

/**
 * Custom exception to handle operations on an empty IntegerSet.
 */
public class IntegerSetException extends Exception {
    public IntegerSetException(String message) {
        super(message);
    }
}
