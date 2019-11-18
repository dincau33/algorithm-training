package tries.medium;

import java.util.HashMap;

public class SuffixTrieConstruction {
    static class TrieNode {
        HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {
            // Write your code here.
        }

        public boolean contains(String str) {
            // Write your code here.
            return false;
        }
    }
}
