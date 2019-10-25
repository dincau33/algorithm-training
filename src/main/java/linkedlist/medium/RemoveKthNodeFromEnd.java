package linkedlist.medium;

import java.util.NoSuchElementException;

/*
 * Write a function that takes in the head of a Singly Linked List and an integer k (assume that the list has at least k nodes).
 * The function should remove the kth node from th end of the list.
 * Note that every node in the Singly Linked List has a "value" property storing its value as well as a "next" property pointing to the next node in the list or None (null) if it is the tail of the list.
 */
public class RemoveKthNodeFromEnd {
    // O(n) time | O(1) space
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        if (head == null) throw new NullPointerException();
        if (k < 0) throw new NoSuchElementException();

        // Get the length of the list
        int length = 0;
        LinkedList current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Get the position of the Node to be removed;
        int nodeToRemoveIdx = length - k;
        if (nodeToRemoveIdx < 0) throw new NoSuchElementException();

        // Remove first node when applicable
        if (nodeToRemoveIdx == 0) {
            if (head.next == null) head = null;
            else {
                head.value = head.next.value;
                head.next = head.next.next;
            }
            return;
        }

        // Remove kth node
        current = head;
        LinkedList previous = null;
        while (nodeToRemoveIdx > 0) {
            nodeToRemoveIdx--;
            LinkedList tmp = current;
            previous = current;
            current = tmp.next;
        }
        previous.next = current.next;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
