package strings.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherEncryptorTest {
    @Test
    public void TestCase1() {
        assertTrue(CaesarCipherEncryptor.caesarCypherEncryptor("abc", 0).equals("abc"));
    }

    @Test
    public void TestCase2() {
        assertTrue(CaesarCipherEncryptor.caesarCypherEncryptor("abc", 3).equals("def"));
    }

    @Test
    public void TestCase3() {
        assertTrue(CaesarCipherEncryptor.caesarCypherEncryptor("xyz", 2).equals("zab"));
    }

    @Test
    public void TestCase4() {
        assertTrue(CaesarCipherEncryptor.caesarCypherEncryptor("xyz", 5).equals("cde"));
    }

    @Test
    public void TestCase5() {
        assertTrue(CaesarCipherEncryptor.caesarCypherEncryptor("abc", 26).equals("abc"));
    }

    @Test
    public void TestCase6() {
        assertTrue(CaesarCipherEncryptor.caesarCypherEncryptor("abc", 52).equals("abc"));
    }

    @Test
    public void TestCase7() {
        assertTrue(CaesarCipherEncryptor.caesarCypherEncryptor("abc", 57).equals("fgh"));
    }
}