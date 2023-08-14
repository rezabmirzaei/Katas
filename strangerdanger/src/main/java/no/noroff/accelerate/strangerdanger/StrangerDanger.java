package no.noroff.accelerate.strangerdanger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StrangerDanger {

    public List<List<String>> noStrangers(String input) {

        /*
         * Remove punctuation and split the input into words.
         * 
         * Using a regex, for the sake of demo, although completely unnecessary here.
         * 
         * A regex (regulas expression) is a patterns that defines thestructure of
         * strings.
         * Typically used in various for searching, matching, and manipulating text.
         * 
         * Some people, when confronted with a problem, think:
         * “I know, I'll use regular expressions.”
         * Now they have two problems.
         */
        String[] words = input.replaceAll("[^a-zA-Z'\\s]|'(?![\\w])", "").toLowerCase().split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();
        List<String> acquaintances = new ArrayList<>();
        List<String> friends = new ArrayList<>();

        for (String word : words) {

            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            int count = wordCountMap.get(word);

            if (count == 3 && acquaintances.contains(word)) {
                acquaintances.remove(word);
                friends.add(word);
            }

            if (count == 3 && !acquaintances.contains(word)) {
                acquaintances.add(word);
            }

            if (count == 5) {
                acquaintances.remove(word);
                friends.add(word);
            }

        }

        return List.of(acquaintances, friends);
    }

}
