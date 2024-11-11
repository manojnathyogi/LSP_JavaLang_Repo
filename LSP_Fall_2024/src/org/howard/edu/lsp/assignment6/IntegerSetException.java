package org.howard.edu.lsp.assignment6;

/**
 * Custom exception to handle operations on an empty IntegerSet.
 */
public class IntegerSetException extends Exception {
    public IntegerSetException(String message) {
        super(message);
    }
}
