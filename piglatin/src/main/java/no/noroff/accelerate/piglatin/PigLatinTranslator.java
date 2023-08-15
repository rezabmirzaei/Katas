package no.noroff.accelerate.piglatin;

public class PigLatinTranslator {

    public String translate(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(pigLatinWord(word)).append(" ");
        }

        return result.toString().trim();
    }

    private String pigLatinWord(String word) {
        if (word.isEmpty()) {
            return "";
        }

        char firstChar = word.charAt(0);
        if (isVowel(firstChar)) {
            return word + "way";
        } else {
            int firstVowelIndex = getFirstVowelIndex(word);
            if (firstVowelIndex == -1) {
                return word + "ay";
            }
            return word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "ay";
        }
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    private int getFirstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

}
