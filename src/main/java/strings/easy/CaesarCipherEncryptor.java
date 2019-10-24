package strings.easy;

public class CaesarCipherEncryptor {
    // O(n) time | O(n) space
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String caesarCypherEncryptor(String str, int key) {
        String encrypted = "";
        for (int i = 0; i < str.length(); i++) {
            encrypted += encrypt(str.charAt(i), key);
        }
        return encrypted;
    }

    private static char encrypt(char c, int key) {
        int idx = ALPHABET.indexOf(c);
        int encryptedIdx = (idx + key) % ALPHABET.length();
        return ALPHABET.charAt(encryptedIdx);
    }
}
