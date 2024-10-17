package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    private Map<String, Integer> candidates; // Store candidate names and their votes

    // Constructor to initialize the HashMap
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    // Add a candidate to the list
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0); // Initialize with 0 votes
        } else {
            System.out.println("Candidate " + name + " is already in the list.");
        }
    }

    // Cast a vote to a candidate
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); // Increment vote count
        } else {
            System.out.println("Candidate " + name + " is not in the list.");
        }
    }

    // Print the number of votes each candidate has received
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Voting Results:\n");
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }

    // Main method to test the VotingMachine class
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();

        // Adding candidates and casting votes as per the example usage
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");

        // Print the voting results
        System.out.println(vm.toString());
    }
}
