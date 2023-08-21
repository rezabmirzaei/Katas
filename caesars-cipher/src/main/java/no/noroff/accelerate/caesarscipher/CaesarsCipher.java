package no.noroff.accelerate.caesarscipher;

public class CaesarsCipher {

    public String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c)) {
                result.append(c);
            }
            // Set a base we can wrap around
            char base = Character.isUpperCase(c) ? 'A' : 'a';
            char encryptedChar = (char) ((c - base + k) % 26 + base);
            result.append(encryptedChar);
        }

        return result.toString();
    }

}
