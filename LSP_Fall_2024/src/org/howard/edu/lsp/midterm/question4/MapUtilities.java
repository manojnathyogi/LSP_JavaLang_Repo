package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {

    public static int commonKeyValuePairs(
        HashMap<String, String> map1,
        HashMap<String, String> map2) {

        // Check if either map is null or empty. If so, return 0.
        if (map1 == null || map2 == null || map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;  // Counter for common key-value pairs.

        // Iterate over each key in the first map.
        for (String key : map1.keySet()) {
            // Check if the second map contains the same key and the same value.
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;  // Increment the counter if key-value pair matches.
            }
        }

        // Return the total count of common key-value pairs.
        return commonCount;
    }
}
