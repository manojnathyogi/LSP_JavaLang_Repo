package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Using the built-in random number generator
        service.setStrategy(new BuiltInRandomGenerator());
        System.out.println("Random number using BuiltInRandomGenerator: " + service.generateRandomNumber());

        // Using the custom random number generator
        service.setStrategy(new CustomRandomGenerator());
        System.out.println("Random number using CustomRandomGenerator: " + service.generateRandomNumber());
    }
}
