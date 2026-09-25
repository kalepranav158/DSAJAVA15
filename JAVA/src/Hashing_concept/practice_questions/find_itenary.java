package Hashing_concept.practice_questions;

import java.util.HashMap;
import java.util.HashSet;

public class find_itenary {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("C", "B");
        map.put("M", "D");
        map.put("G", "C");
        map.put("D", "G");

        // Step 1: Store all destinations
        HashSet<String> destinations = new HashSet<>();
        for (String dest : map.values()) {
            destinations.add(dest);
        }

        // Step 2: Find starting city
        String start = "";
        for (String src : map.keySet()) {
            if (!destinations.contains(src)) {
                start = src;
                break;
            }
        }

        // Step 3: Print itinerary
        while (map.containsKey(start)) {
            System.out.print(start + " -> ");
            start = map.get(start);
        }
        System.out.print(start); // last city
    }
}
