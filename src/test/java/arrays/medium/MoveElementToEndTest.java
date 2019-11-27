package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveElementToEndTest {
    @Test
    public void TestCase1() {
        List<Integer> array = new ArrayList<Integer>();
        int toMove = 3;
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
        assertTrue(output.equals(expected));
    }

    @Test
    public void TestCase2() {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 6));
        int toMove = 3;
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 6));
        List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
        output.sort(Comparator.naturalOrder());
        assertTrue(output.equals(expected));
    }

    @Test
    public void TestCase3() {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(3, 3, 3, 3, 3));
        int toMove = 3;
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 3, 3, 3, 3));
        List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
        assertTrue(output.equals(expected));
    }

    @Test
    public void TestCase4() {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(3, 1, 2, 4, 5));
        int toMove = 3;
        List<Integer> expectedStart = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5));
        List<Integer> expectedEnd = new ArrayList<Integer>(Arrays.asList(3));
        List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
        List<Integer> outputStart = output.subList(0, 4);
        outputStart.sort(Comparator.naturalOrder());
        List<Integer> outputEnd = output.subList(4, output.size());
        assertTrue(outputStart.equals(expectedStart));
        assertTrue(outputEnd.equals(expectedEnd));
    }

    @Test
    public void TestCase5() {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 3));
        int toMove = 3;
        List<Integer> expectedStart = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5));
        List<Integer> expectedEnd = new ArrayList<Integer>(Arrays.asList(3));
        List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
        List<Integer> outputStart = output.subList(0, 4);
        outputStart.sort(Comparator.naturalOrder());
        List<Integer> outputEnd = output.subList(4, output.size());
        assertTrue(outputStart.equals(expectedStart));
        assertTrue(outputEnd.equals(expectedEnd));
    }

    @Test
    public void TestCase6() {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int toMove = 3;
        List<Integer> expectedStart = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5));
        List<Integer> expectedEnd = new ArrayList<Integer>(Arrays.asList(3));
        List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
        List<Integer> outputStart = output.subList(0, 4);
        outputStart.sort(Comparator.naturalOrder());
        List<Integer> outputEnd = output.subList(4, output.size());
        assertTrue(outputStart.equals(expectedStart));
        assertTrue(outputEnd.equals(expectedEnd));
    }

    @Test
    public void TestCase7() {
        List<Integer> array =
                new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 5, 5, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12));
        int toMove = 5;
        List<Integer> expectedStart =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12));
        List<Integer> expectedEnd = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 5, 5));
        List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
        List<Integer> outputStart = output.subList(0, 11);
        outputStart.sort(Comparator.naturalOrder());
        List<Integer> outputEnd = output.subList(11, output.size());
        assertTrue(outputStart.equals(expectedStart));
        assertTrue(outputEnd.equals(expectedEnd));
    }

    @Test
    public void TestCase8() {
        List<Integer> array =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 5, 5, 5, 5, 5, 5));
        int toMove = 5;
        List<Integer> expectedStart =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12));
        List<Integer> expectedEnd = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 5, 5));
        List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
        List<Integer> outputStart = output.subList(0, 11);
        outputStart.sort(Comparator.naturalOrder());
        List<Integer> outputEnd = output.subList(11, output.size());
        assertTrue(outputStart.equals(expectedStart));
        assertTrue(outputEnd.equals(expectedEnd));
    }

    @Test
    public void TestCase9() {
        List<Integer> array =
                new ArrayList<Integer>(Arrays.asList(5, 1, 2, 5, 5, 3, 4, 6, 7, 5, 8, 9, 10, 11, 5, 5, 12));
        int toMove = 5;
        List<Integer> expectedStart =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12));
        List<Integer> expectedEnd = new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5, 5, 5));
        List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
        List<Integer> outputStart = output.subList(0, 11);
        outputStart.sort(Comparator.naturalOrder());
        List<Integer> outputEnd = output.subList(11, output.size());
        assertTrue(outputStart.equals(expectedStart));
        assertTrue(outputEnd.equals(expectedEnd));
    }

    @Test
    public void TestCase10() {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
        int toMove = 2;
        List<Integer> expectedStart = new ArrayList<Integer>(Arrays.asList(1, 3, 4));
        List<Integer> expectedEnd = new ArrayList<Integer>(Arrays.asList(2, 2, 2, 2, 2));
        List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
        List<Integer> outputStart = output.subList(0, 3);
        outputStart.sort(Comparator.naturalOrder());
        List<Integer> outputEnd = output.subList(3, output.size());
        assertTrue(outputStart.equals(expectedStart));
        assertTrue(outputEnd.equals(expectedEnd));
    }
}