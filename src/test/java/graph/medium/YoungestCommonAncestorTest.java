package graph.medium;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class YoungestCommonAncestorTest {
    static HashMap<Character, YoungestCommonAncestor.AncestralTree> ancestralTrees;
    static String alphabet;

    static {
        ancestralTrees = new HashMap<Character, YoungestCommonAncestor.AncestralTree>();
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char a : alphabet.toCharArray()) {
            ancestralTrees.put(a, new YoungestCommonAncestor.AncestralTree(a));
        }

        ancestralTrees
                .get('A')
                .addAsAncestor(
                        new YoungestCommonAncestor.AncestralTree[] {
                                ancestralTrees.get('B'),
                                ancestralTrees.get('C'),
                                ancestralTrees.get('D'),
                                ancestralTrees.get('E'),
                                ancestralTrees.get('F')
                        });
        ancestralTrees
                .get('B')
                .addAsAncestor(
                        new YoungestCommonAncestor.AncestralTree[] {
                                ancestralTrees.get('G'), ancestralTrees.get('H'), ancestralTrees.get('I')
                        });
        ancestralTrees.get('C').addAsAncestor(new YoungestCommonAncestor.AncestralTree[] {ancestralTrees.get('J')});
        ancestralTrees
                .get('D')
                .addAsAncestor(
                        new YoungestCommonAncestor.AncestralTree[] {ancestralTrees.get('K'), ancestralTrees.get('L')});
        ancestralTrees
                .get('F')
                .addAsAncestor(
                        new YoungestCommonAncestor.AncestralTree[] {ancestralTrees.get('M'), ancestralTrees.get('N')});
        ancestralTrees
                .get('H')
                .addAsAncestor(
                        new YoungestCommonAncestor.AncestralTree[] {
                                ancestralTrees.get('O'),
                                ancestralTrees.get('P'),
                                ancestralTrees.get('Q'),
                                ancestralTrees.get('R')
                        });
        ancestralTrees.get('K').addAsAncestor(new YoungestCommonAncestor.AncestralTree[] {ancestralTrees.get('S')});
        ancestralTrees
                .get('P')
                .addAsAncestor(
                        new YoungestCommonAncestor.AncestralTree[] {ancestralTrees.get('T'), ancestralTrees.get('U')});
        ancestralTrees.get('R').addAsAncestor(new YoungestCommonAncestor.AncestralTree[] {ancestralTrees.get('V')});
        ancestralTrees
                .get('V')
                .addAsAncestor(
                        new YoungestCommonAncestor.AncestralTree[] {
                                ancestralTrees.get('W'), ancestralTrees.get('X'), ancestralTrees.get('Y')
                        });
        ancestralTrees.get('X').addAsAncestor(new YoungestCommonAncestor.AncestralTree[] {ancestralTrees.get('Z')});
    }

    @Test
    public void TestCase1() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('A'), ancestralTrees.get('B'));
        assertTrue(yca == ancestralTrees.get('A'));
    }

    @Test
    public void TestCase2() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('B'), ancestralTrees.get('F'));
        assertTrue(yca == ancestralTrees.get('A'));
    }

    @Test
    public void TestCase3() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('G'), ancestralTrees.get('M'));
        assertTrue(yca == ancestralTrees.get('A'));
    }

    @Test
    public void TestCase4() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('U'), ancestralTrees.get('S'));
        assertTrue(yca == ancestralTrees.get('A'));
    }

    @Test
    public void TestCase5() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('Z'), ancestralTrees.get('M'));
        assertTrue(yca == ancestralTrees.get('A'));
    }

    @Test
    public void TestCase6() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('O'), ancestralTrees.get('I'));
        assertTrue(yca == ancestralTrees.get('B'));
    }

    @Test
    public void TestCase7() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('T'), ancestralTrees.get('Z'));
        assertTrue(yca == ancestralTrees.get('H'));
    }

    @Test
    public void TestCase8() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('T'), ancestralTrees.get('V'));
        assertTrue(yca == ancestralTrees.get('H'));
    }

    @Test
    public void TestCase9() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('T'), ancestralTrees.get('H'));
        assertTrue(yca == ancestralTrees.get('H'));
    }

    @Test
    public void TestCase10() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('W'), ancestralTrees.get('V'));
        assertTrue(yca == ancestralTrees.get('V'));
    }

    @Test
    public void TestCase11() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('Z'), ancestralTrees.get('B'));
        assertTrue(yca == ancestralTrees.get('B'));
    }

    @Test
    public void TestCase12() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('Q'), ancestralTrees.get('W'));
        assertTrue(yca == ancestralTrees.get('H'));
    }

    @Test
    public void TestCase13() {
        YoungestCommonAncestor.AncestralTree yca =
                YoungestCommonAncestor.getYoungestCommonAncestor(
                        ancestralTrees.get('A'), ancestralTrees.get('A'), ancestralTrees.get('Z'));
        assertTrue(yca == ancestralTrees.get('A'));
    }
}