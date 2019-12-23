package strings.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    @Test
    public void TestCase1() {
        List<String> words = new ArrayList<String>();
        List<List<String>> expected = new ArrayList<List<String>>();
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    public void TestCase2() {
        List<String> words = new ArrayList<String>(Arrays.asList("test"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("test")));
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    public void TestCase3() {
        List<String> words = new ArrayList<String>(Arrays.asList("abc", "dabd", "bca", "cab", "ddba"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("abc", "bca", "cab")));
        expected.add(new ArrayList<String>(Arrays.asList("dabd", "ddba")));
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    public void TestCase4() {
        List<String> words = new ArrayList<String>(Arrays.asList("abc", "cba", "bca"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("abc", "cba", "bca")));
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    public void TestCase5() {
        List<String> words =
                new ArrayList<String>(Arrays.asList("zxc", "asd", "weq", "sda", "qwe", "xcz"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("zxc", "xcz")));
        expected.add(new ArrayList<String>(Arrays.asList("asd", "sda")));
        expected.add(new ArrayList<String>(Arrays.asList("qwe", "weq")));
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    public void TestCase6() {
        List<String> words =
                new ArrayList<String>(Arrays.asList("yo", "act", "flop", "tac", "cat", "oy", "olfp"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("yo", "oy")));
        expected.add(new ArrayList<String>(Arrays.asList("flop", "olfp")));
        expected.add(new ArrayList<String>(Arrays.asList("act", "tac", "cat")));
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    public void TestCase7() {
        List<String> words =
                new ArrayList<String>(
                        Arrays.asList("cinema", "a", "flop", "iceman", "meacyne", "lofp", "olfp"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("cinema", "iceman")));
        expected.add(new ArrayList<String>(Arrays.asList("flop", "lofp", "olfp")));
        expected.add(new ArrayList<String>(Arrays.asList("a")));
        expected.add(new ArrayList<String>(Arrays.asList("meacyne")));
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    public void TestCase8() {
        List<String> words = new ArrayList<String>(Arrays.asList("abc", "abe", "abf", "abg"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("abc")));
        expected.add(new ArrayList<String>(Arrays.asList("abe")));
        expected.add(new ArrayList<String>(Arrays.asList("abf")));
        expected.add(new ArrayList<String>(Arrays.asList("abg")));
        List<List<String>> output = GroupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    public boolean compare(List<List<String>> expected, List<List<String>> output) {
        if (expected.size() != output.size()) return false;

        for (List<String> group : expected) {
            Collections.sort(group);
            if (!output.contains(group)) return false;
        }

        return true;
    }
}