package tries.medium;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class SuffixTrieConstructionTest {
    String word1 = "test";
    SuffixTrieConstruction.SuffixTrie trie1 = new SuffixTrieConstruction.SuffixTrie(word1);
    SuffixTrieTest trie1Test = new SuffixTrieTest(word1);
    String word2 = "invisible";
    SuffixTrieConstruction.SuffixTrie trie2 = new SuffixTrieConstruction.SuffixTrie(word2);
    SuffixTrieTest trie2Test = new SuffixTrieTest(word2);
    String word3 = "123456789";
    SuffixTrieConstruction.SuffixTrie trie3 = new SuffixTrieConstruction.SuffixTrie(word3);
    SuffixTrieTest trie3Test = new SuffixTrieTest(word3);
    String word4 = "testtest";
    SuffixTrieConstruction.SuffixTrie trie4 = new SuffixTrieConstruction.SuffixTrie(word4);
    SuffixTrieTest trie4Test = new SuffixTrieTest(word4);
    String word5 = "ttttttttt";
    SuffixTrieConstruction.SuffixTrie trie5 = new SuffixTrieConstruction.SuffixTrie(word5);
    SuffixTrieTest trie5Test = new SuffixTrieTest(word5);
    String word6 = "babc";
    SuffixTrieConstruction.SuffixTrie trie6 = new SuffixTrieConstruction.SuffixTrie(word6);
    SuffixTrieTest trie6Test = new SuffixTrieTest(word6);

    @Test
    public void TestCase1() {
        for (int i = word1.length() - 1; i >= 0; i--) {
            String substring = word1.substring(i);
            assertTrue(trie1.contains(substring));
        }
    }

    @Test
    public void TestCase2() {
        for (int i = word2.length() - 1; i >= 0; i--) {
            String substring = word2.substring(i);
            assertTrue(trie2.contains(substring));
        }
    }

    @Test
    public void TestCase3() {
        for (int i = word3.length() - 1; i >= 0; i--) {
            String substring = word3.substring(i);
            assertTrue(trie3.contains(substring));
        }
    }

    @Test
    public void TestCase4() {
        for (int i = word4.length() - 1; i >= 0; i--) {
            String substring = word4.substring(i);
            assertTrue(trie4.contains(substring));
        }
    }

    @Test
    public void TestCase5() {
        for (int i = word5.length() - 1; i >= 0; i--) {
            String substring = word5.substring(i);
            assertTrue(trie5.contains(substring));
        }
    }

    @Test
    public void TestCase6() {
        for (int i = word6.length() - 1; i >= 0; i--) {
            String substring = word6.substring(i);
            assertTrue(trie6.contains(substring));
        }
    }

    @Test
    public void TestCase7() {
        assertTrue(compareTries(trie1.root, trie1Test.root));
    }

    @Test
    public void TestCase8() {
        assertTrue(compareTries(trie2.root, trie2Test.root));
    }

    @Test
    public void TestCase9() {
        assertTrue(compareTries(trie3.root, trie3Test.root));
    }

    @Test
    public void TestCase10() {
        assertTrue(compareTries(trie4.root, trie4Test.root));
    }

    @Test
    public void TestCase11() {
        assertTrue(compareTries(trie5.root, trie5Test.root));
    }

    @Test
    public void TestCase12() {
        assertTrue(compareTries(trie6.root, trie6Test.root));
    }

    @Test
    public void TestCase13() {
        assertTrue(!trie1.contains("tes"));
    }

    @Test
    public void TestCase14() {
        assertTrue(!trie1.contains("nvisibl"));
    }

    @Test
    public void TestCase15() {
        assertTrue(!trie1.contains("45567"));
    }

    @Test
    public void TestCase16() {
        assertTrue(!trie1.contains("tt"));
    }

    @Test
    public void TestCase17() {
        assertTrue(!trie1.contains("vvv"));
    }

    @Test
    public void TestCase18() {
        assertTrue(!trie1.contains("bab"));
    }

    public boolean compareTries(SuffixTrieConstruction.TrieNode t1, TrieNode t2) {
        if (t1.children.size() != t2.children.size()) {
            return false;
        }
        for (HashMap.Entry<Character, SuffixTrieConstruction.TrieNode> entry : t1.children.entrySet()) {
            Character key = entry.getKey();
            if (key == '*') {
                continue;
            }
            SuffixTrieConstruction.TrieNode value = entry.getValue();
            if (!t2.children.containsKey(key)) {
                return false;
            } else if (value != null & !compareTries(value, t2.children.get(key))) {
                return false;
            }
        }
        return true;
    }

    static class TrieNode {
        HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    }

    static class SuffixTrieTest {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrieTest(String s) {
            populateSuffixTrieFrom(s);
        }

        public void populateSuffixTrieFrom(String s) {
            for (int i = 0; i < s.length(); i++) {
                insertSubstringStartingAt(i, s);
            }
        }

        public void insertSubstringStartingAt(int i, String s) {
            TrieNode node = root;
            for (int j = i; j < s.length(); j++) {
                char letter = s.charAt(j);
                if (!node.children.containsKey(letter)) {
                    TrieNode newNode = new TrieNode();
                    node.children.put(letter, newNode);
                }
                node = node.children.get(letter);
            }
            node.children.put(endSymbol, null);
        }

        public boolean contains(String s) {
            TrieNode node = root;
            for (int i = 0; i < s.length(); i++) {
                char letter = s.charAt(i);
                if (!node.children.containsKey(letter)) {
                    return false;
                }
                node = node.children.get(letter);
            }
            return node.children.containsKey(endSymbol) ? true : false;
        }
    }
}