package no.noroff.accelerate.piglatin;

public class PigLatinTranslator {

    private final String VOWELS = "aeiouAEIOU";

    public String translate(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder piglatinedSentence = new StringBuilder();

        for (String word : words) {
            piglatinedSentence.append(pigLatinWord(word)).append(" ");
        }

        return piglatinedSentence.toString().trim();
    }

    private String pigLatinWord(String word) {
        char firstChar = word.charAt(0);
        if (isVowel(firstChar)) {
            return word + "way";
        } else {
            int firstVowelIndex = getFirstVowelIndex(word);
            return firstVowelIndex != -1 ? word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "ay"
                    : word;
        }
    }

    private boolean isVowel(char c) {
        return VOWELS.indexOf(c) != -1;
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
