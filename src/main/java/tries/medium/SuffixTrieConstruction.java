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
            for (int i = 0; i < str.length(); i++) populateSuffixTrieFromSubstring(i, str);
        }

        private void populateSuffixTrieFromSubstring(int i, String str) {
            TrieNode node = root;
            for (int j = i; j < str.length(); j++) {
                if (node.children.containsKey(str.charAt(j))) node = node.children.get(str.charAt(j));
                else {
                    TrieNode newNode = new TrieNode();
                    node.children.put(str.charAt(j), newNode);
                    node = newNode;
                }
            }
            node.children.put(endSymbol, null);
        }

        public boolean contains(String str) {
            TrieNode node = root;
            for (char c : str.toCharArray()) {
                if (node.children.containsKey(c)) node = node.children.get(c);
                else return false;
            }
            return node.children.containsKey(endSymbol) ? true : false;
        }
    }
}
