package linkedlist.easy;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListConstructionTest {
    private void expectEmpty(LinkedListConstruction.DoublyLinkedList linkedList) {
        assertTrue(linkedList.head == null);
        assertTrue(linkedList.tail == null);
    }

    private void expectHeadTail(
            LinkedListConstruction.DoublyLinkedList linkedList, LinkedListConstruction.Node head, LinkedListConstruction.Node tail) {
        assertTrue(linkedList.head == head);
        assertTrue(linkedList.tail == tail);
    }

    private void expectSingleNode(LinkedListConstruction.DoublyLinkedList linkedList, LinkedListConstruction.Node node) {
        assertTrue(linkedList.head == node);
        assertTrue(linkedList.tail == node);
    }

    private ArrayList<Integer> getNodeValuesHeadToTail(LinkedListConstruction.DoublyLinkedList linkedList) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        LinkedListConstruction.Node node = linkedList.head;
        while (node != null) {
            values.add(node.value);
            node = node.next;
        }
        return values;
    }

    private ArrayList<Integer> getNodeValuesTailToHead(LinkedListConstruction.DoublyLinkedList linkedList) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        LinkedListConstruction.Node node = linkedList.tail;
        while (node != null) {
            values.add(node.value);
            node = node.prev;
        }
        return values;
    }

    private void removeNodes(LinkedListConstruction.DoublyLinkedList linkedList, ArrayList<LinkedListConstruction.Node> nodes) {
        for (LinkedListConstruction.Node node : nodes) {
            linkedList.remove(node);
        }
    }

    private boolean compare(ArrayList<Integer> array1, int[] array2) {
        if (array1.size() != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) != array2[i]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void TestCase1() {
        LinkedListConstruction.DoublyLinkedList linkedList = new LinkedListConstruction.DoublyLinkedList();
        LinkedListConstruction.Node node = new LinkedListConstruction.Node(1);

        linkedList.setHead(node);
        expectSingleNode(linkedList, node);
        linkedList.remove(node);
        expectEmpty(linkedList);
        linkedList.setTail(node);
        expectSingleNode(linkedList, node);
        linkedList.removeNodesWithValue(1);
        expectEmpty(linkedList);
        linkedList.insertAtPosition(1, node);
        expectSingleNode(linkedList, node);
    }

    @Test
    public void TestCase2() {
        LinkedListConstruction.DoublyLinkedList linkedList = new LinkedListConstruction.DoublyLinkedList();
        LinkedListConstruction.Node first = new LinkedListConstruction.Node(1);
        LinkedListConstruction.Node second = new LinkedListConstruction.Node(2);
        ArrayList<LinkedListConstruction.Node> nodes = new ArrayList<LinkedListConstruction.Node>();
        nodes.add(first);
        nodes.add(second);

        linkedList.setHead(first);
        linkedList.setTail(second);
        expectHeadTail(linkedList, first, second);
        removeNodes(linkedList, nodes);
        expectEmpty(linkedList);
        linkedList.setHead(first);
        linkedList.insertAfter(first, second);
        expectHeadTail(linkedList, first, second);
        removeNodes(linkedList, nodes);
        linkedList.setHead(first);
        linkedList.insertBefore(first, second);
        expectHeadTail(linkedList, second, first);
        removeNodes(linkedList, nodes);
        linkedList.insertAtPosition(1, first);
        linkedList.insertAtPosition(2, second);
        expectHeadTail(linkedList, first, second);
        removeNodes(linkedList, nodes);
        linkedList.insertAtPosition(2, first);
        linkedList.insertAtPosition(1, second);
        expectHeadTail(linkedList, second, first);
    }

    @Test
    public void TestCase3() {
        LinkedListConstruction.DoublyLinkedList linkedList = new LinkedListConstruction.DoublyLinkedList();
        LinkedListConstruction.Node first = new LinkedListConstruction.Node(1);
        LinkedListConstruction.Node second = new LinkedListConstruction.Node(2);
        LinkedListConstruction.Node third = new LinkedListConstruction.Node(3);
        LinkedListConstruction.Node fourth = new LinkedListConstruction.Node(4);

        linkedList.setHead(first);
        assertTrue(linkedList.containsNodeWithValue(1) == true);
        linkedList.insertAfter(first, second);
        assertTrue(linkedList.containsNodeWithValue(2) == true);
        linkedList.insertAfter(second, third);
        assertTrue(linkedList.containsNodeWithValue(3) == true);
        linkedList.insertAfter(third, fourth);
        assertTrue(linkedList.containsNodeWithValue(4) == true);
        linkedList.removeNodesWithValue(3);
        assertTrue(linkedList.containsNodeWithValue(3) == false);
        linkedList.remove(first);
        assertTrue(linkedList.containsNodeWithValue(1) == false);
        linkedList.removeNodesWithValue(4);
        assertTrue(linkedList.containsNodeWithValue(4) == false);
        linkedList.remove(second);
        assertTrue(linkedList.containsNodeWithValue(2) == false);
    }

    @Test
    public void TestCase4() {
        LinkedListConstruction.DoublyLinkedList linkedList = new LinkedListConstruction.DoublyLinkedList();
        LinkedListConstruction.Node first = new LinkedListConstruction.Node(1);
        LinkedListConstruction.Node second = new LinkedListConstruction.Node(2);
        LinkedListConstruction.Node third = new LinkedListConstruction.Node(3);
        LinkedListConstruction.Node fourth = new LinkedListConstruction.Node(3);
        LinkedListConstruction.Node fifth = new LinkedListConstruction.Node(3);
        LinkedListConstruction.Node sixth = new LinkedListConstruction.Node(6);
        LinkedListConstruction.Node seventh = new LinkedListConstruction.Node(7);

        linkedList.setHead(first);
        linkedList.insertAfter(first, second);
        linkedList.insertAfter(second, third);
        linkedList.insertAfter(third, fourth);
        linkedList.insertAfter(fourth, fifth);
        linkedList.insertAfter(fifth, sixth);
        linkedList.insertAfter(sixth, seventh);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 3, 3, 6, 7}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {7, 6, 3, 3, 3, 2, 1}));
        expectHeadTail(linkedList, first, seventh);
        linkedList.remove(second);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 3, 3, 6, 7}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {7, 6, 3, 3, 3, 1}));
        expectHeadTail(linkedList, first, seventh);
        linkedList.removeNodesWithValue(1);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 3, 3, 6, 7}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {7, 6, 3, 3, 3}));
        expectHeadTail(linkedList, third, seventh);
        linkedList.removeNodesWithValue(3);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 7}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {7, 6}));
        expectHeadTail(linkedList, sixth, seventh);
        linkedList.removeNodesWithValue(7);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6}));
        expectHeadTail(linkedList, sixth, sixth);
    }

    @Test
    public void TestCase5() {
        LinkedListConstruction.DoublyLinkedList linkedList = new LinkedListConstruction.DoublyLinkedList();
        LinkedListConstruction.Node first = new LinkedListConstruction.Node(1);
        LinkedListConstruction.Node second = new LinkedListConstruction.Node(2);
        LinkedListConstruction.Node third = new LinkedListConstruction.Node(3);
        LinkedListConstruction.Node fourth = new LinkedListConstruction.Node(4);
        LinkedListConstruction.Node fifth = new LinkedListConstruction.Node(5);
        LinkedListConstruction.Node sixth = new LinkedListConstruction.Node(6);
        LinkedListConstruction.Node seventh = new LinkedListConstruction.Node(7);

        linkedList.setHead(first);
        linkedList.insertAfter(first, second);
        linkedList.insertAfter(second, third);
        linkedList.insertAfter(third, fourth);
        linkedList.insertAfter(fourth, fifth);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 4, 5}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 2, 1}));
        expectHeadTail(linkedList, first, fifth);
        linkedList.insertAfter(third, fifth);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 5, 4}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 5, 3, 2, 1}));
        expectHeadTail(linkedList, first, fourth);
        linkedList.insertAfter(third, first);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 3, 1, 5, 4}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 5, 1, 3, 2}));
        expectHeadTail(linkedList, second, fourth);
        linkedList.insertAfter(fifth, second);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 1, 5, 2, 4}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 2, 5, 1, 3}));
        expectHeadTail(linkedList, third, fourth);
        linkedList.insertAfter(second, first);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 5, 2, 1, 4}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 1, 2, 5, 3}));
        expectHeadTail(linkedList, third, fourth);
        linkedList.insertAfter(fourth, sixth);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 5, 2, 1, 4, 6}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 4, 1, 2, 5, 3}));
        expectHeadTail(linkedList, third, sixth);
        linkedList.insertAfter(second, seventh);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 5, 2, 7, 1, 4, 6}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 4, 1, 7, 2, 5, 3}));
        expectHeadTail(linkedList, third, sixth);
    }

    @Test
    public void TestCase6() {
        LinkedListConstruction.DoublyLinkedList linkedList = new LinkedListConstruction.DoublyLinkedList();
        LinkedListConstruction.Node first = new LinkedListConstruction.Node(1);
        LinkedListConstruction.Node second = new LinkedListConstruction.Node(2);
        LinkedListConstruction.Node third = new LinkedListConstruction.Node(3);
        LinkedListConstruction.Node fourth = new LinkedListConstruction.Node(4);
        LinkedListConstruction.Node fifth = new LinkedListConstruction.Node(5);
        LinkedListConstruction.Node sixth = new LinkedListConstruction.Node(6);
        LinkedListConstruction.Node seventh = new LinkedListConstruction.Node(7);

        linkedList.setHead(first);
        linkedList.insertBefore(first, second);
        linkedList.insertBefore(second, third);
        linkedList.insertBefore(third, fourth);
        linkedList.insertBefore(fourth, fifth);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {5, 4, 3, 2, 1}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {1, 2, 3, 4, 5}));
        expectHeadTail(linkedList, fifth, first);
        linkedList.insertBefore(third, first);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {5, 4, 1, 3, 2}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {2, 3, 1, 4, 5}));
        expectHeadTail(linkedList, fifth, second);
        linkedList.insertBefore(fifth, second);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 5, 4, 1, 3}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 4, 5, 2}));
        expectHeadTail(linkedList, second, third);
        linkedList.insertBefore(fifth, fourth);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 4, 5, 1, 3}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 5, 4, 2}));
        expectHeadTail(linkedList, second, third);
        linkedList.insertBefore(second, sixth);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 2, 4, 5, 1, 3}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 5, 4, 2, 6}));
        expectHeadTail(linkedList, sixth, third);
        linkedList.insertBefore(first, seventh);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 2, 4, 5, 7, 1, 3}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 7, 5, 4, 2, 6}));
        expectHeadTail(linkedList, sixth, third);
    }

    @Test
    public void TestCase7() {
        LinkedListConstruction.DoublyLinkedList linkedList = new LinkedListConstruction.DoublyLinkedList();
        LinkedListConstruction.Node first = new LinkedListConstruction.Node(1);
        LinkedListConstruction.Node second = new LinkedListConstruction.Node(2);
        LinkedListConstruction.Node third = new LinkedListConstruction.Node(3);
        LinkedListConstruction.Node fourth = new LinkedListConstruction.Node(4);
        LinkedListConstruction.Node fifth = new LinkedListConstruction.Node(5);
        LinkedListConstruction.Node sixth = new LinkedListConstruction.Node(6);
        LinkedListConstruction.Node seventh = new LinkedListConstruction.Node(7);

        linkedList.setHead(first);
        linkedList.insertAtPosition(1, second);
        linkedList.insertAtPosition(1, third);
        linkedList.insertAtPosition(1, fourth);
        linkedList.insertAtPosition(1, fifth);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {5, 4, 3, 2, 1}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {1, 2, 3, 4, 5}));
        expectHeadTail(linkedList, fifth, first);
        linkedList.insertAtPosition(2, first);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {5, 1, 4, 3, 2}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {2, 3, 4, 1, 5}));
        expectHeadTail(linkedList, fifth, second);
        linkedList.insertAtPosition(1, second);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 5, 1, 4, 3}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 4, 1, 5, 2}));
        expectHeadTail(linkedList, second, third);
        linkedList.insertAtPosition(2, fourth);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 4, 5, 1, 3}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 5, 4, 2}));
        expectHeadTail(linkedList, second, third);
        linkedList.insertAtPosition(1, sixth);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 2, 4, 5, 1, 3}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 5, 4, 2, 6}));
        expectHeadTail(linkedList, sixth, third);
        linkedList.insertAtPosition(5, seventh);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 2, 4, 5, 7, 1, 3}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 1, 7, 5, 4, 2, 6}));
        expectHeadTail(linkedList, sixth, third);
        linkedList.insertAtPosition(8, fourth);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 2, 5, 7, 1, 3, 4}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 3, 1, 7, 5, 2, 6}));
        expectHeadTail(linkedList, sixth, fourth);
    }
}