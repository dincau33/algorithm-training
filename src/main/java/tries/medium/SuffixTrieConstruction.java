package tries.medium;

import java.util.HashMap;

/*
 * Write a class for a suffix-trie-like data structure.
 * The class should have a "root" property set to be the root node of the trie.
 * The class should support creation from a string and the searching of strings.
 * The creation method (called populateSuffixTrieFrom()) will be called when the class is instantiated and should populate the "root" property of the class.
 * Note that every string added to the trie should end with the special "endSymbol" character. "*".
 */
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
