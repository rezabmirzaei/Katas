package no.noroff.accelerate;

import java.util.Arrays;

public class AlphabetSoup {

    public String forLoopAlphabetSoup(String strToSort) {

        // E.g. "hello": ['h', 'e', 'l', 'l', '0']
        char[] chars = strToSort.toCharArray();

        for (int i = 1; i < chars.length; i++) {
            for (int j = i; j > 0; j--) {
                if (chars[j] < chars[j - 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j - 1];
                    chars[j - 1] = temp;
                }
            }
        }

        return new String(chars);
    }

    public String arraysSortAlphabetSoup(String strToSort) {
        char[] chars = strToSort.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
