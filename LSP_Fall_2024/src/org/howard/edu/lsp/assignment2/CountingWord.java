package org.howard.edu.lsp.assignment2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class CountingWord {

    public static void main(String[] args) {
        String filePath = "src/org/howard/edu/lsp/assignment2/words.txt";
        Map<String, Integer> wordCounts = new HashMap<>();

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            // Processing each line from the file
            lines.forEach(line -> {
                // Echo the line (echoing the input file to stdout)
                System.out.println(line);

                // Removing punctuation and handling contractions by splitting on non-letters/apostrophes
                String[] words = line.toLowerCase()
                        .replaceAll("[^a-zA-Z\\s']", "") // Replacing non-letters except apostrophes
                        .split("\\s+"); // Splitting on whitespace

                // Counting each word that is not trivial
                for (String word : words) {
                    // Check for contractions and split if needed
                    if (word.contains("'")) {
                        String[] splitWords = word.split("'"); // Split by apostrophe
                        for (String splitWord : splitWords) {
                            if (splitWord.length() > 3) {  // Only count words with more than 3 characters
                                wordCounts.put(splitWord, wordCounts.getOrDefault(splitWord, 0) + 1);
                            }
                        }
                    } else if (word.length() > 3) {
                        // If it's not a contraction and longer than 3 characters, counting the word
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            });

            // Sorting and printing the word counts
            wordCounts.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByKey())
                    .forEach(entry -> System.out.println(entry.getKey() + "\t" + entry.getValue()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
