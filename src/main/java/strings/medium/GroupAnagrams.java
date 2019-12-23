package strings.medium;

import java.util.*;

/*
 * Write a function that takes in an array of strings and returns a list of groups of anagrams.
 * Anagrams are strings made up of exactly the same letters, where order doesn't matter.
 * For example, "cinema" and "iceman" are anagrams; similarly, "foo" and "ofo" are anagrams.
 * Note that the groups aof anagrams don't need to be ordered in any particular way.
 */
public class GroupAnagrams {
    // Complexity: O(w * n * log(n)) time | O(w * n) space - where w is the number of words and n is the length of the longest word
    public static List<List<String>> groupAnagrams(List<String> words) {
        HashMap<String, List<String>> anagramsList = new HashMap<>();
        for (String word:words) {
            String sortedStr = sortString(word);
            if (anagramsList.containsKey(sortedStr)) anagramsList.get(sortedStr).add(word);
            else {
                List<String> anagram = new ArrayList<>();
                anagram.add(word);
                anagramsList.put(sortedStr, anagram);
            }
        }
        return convertMapToString(anagramsList);
    }

    public static String sortString(String str) {
        char[] tmp = str.toCharArray();
        Arrays.sort(tmp);
        return new String(tmp);
    }

    public static List<List<String>> convertMapToString(Map<String, List<String>> map) {
        Collection<List<String>> values = map.values();
        return new ArrayList<List<String>>(values);
    }
}
