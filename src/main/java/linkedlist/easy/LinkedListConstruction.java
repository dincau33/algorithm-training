package linkedlist.easy;

/*
 * Write a class for a Doubly Linked List. The class should have a "head" and "tail" properties, both of which should point to either the None (null) value or to a Linked List node.
 * Every node will have a "value" property as well as "next" and "prev" properties, both of which can point to either the None (null) value or another node.
 * The class should support setting the head and tail of the linked list, inserting nodes before and after other nodes as well ass at certain positions, removing given nodes and removing nodes with specific values, and searching for nodes with values.
 * Only the searching method should return a value: specifically; a boolean.
 */
public class LinkedListConstruction {
    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        // O(1) time | O(1) space
        public void setHead(Node node) {
            if (head == null) {
                head = node;
                tail = node;
                return;
            }
            insertBefore(head, node);
        }

        // O(1) time | O(1) space
        public void setTail(Node node) {
            if (tail == null) {
                head = node;
                tail = node;
            }
            insertAfter(tail, node);
        }

        // O(1) time | O(1) space
        public void insertBefore(Node node, Node nodeToInsert) {
            if (nodeToInsert == this.head && nodeToInsert == this.tail) return;
            remove(nodeToInsert);
            nodeToInsert.next = node;
            nodeToInsert.prev = node.prev;
            if (node.prev != null) {
                node.prev.next = nodeToInsert;
            } else {
                this.head = nodeToInsert;
            }
            node.prev = nodeToInsert;
        }

        // O(1) time | O(1) space
        public void insertAfter(Node node, Node nodeToInsert) {
            if (nodeToInsert == this.head && nodeToInsert == this.tail) return;
            remove(nodeToInsert);
            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;
            if (node.next != null) {
                node.next.prev = nodeToInsert;
            } else {
                this.tail = nodeToInsert;
            }
            node.next = nodeToInsert;
        }

        // O(n) time | O(1) space
        public void insertAtPosition(int position, Node nodeToInsert) {
            if (position == 1) {
                setHead(nodeToInsert);
                return;
            }
            int currentPosition = 1;
            Node node = this.head;
            while (node != null && currentPosition++ != position) node = node.next;
            if (node != null) {
                insertBefore(node, nodeToInsert);
            } else {
                setTail(nodeToInsert);
            }
        }

        // O(n) time | O(1) space
        public void removeNodesWithValue(int value) {
            Node node = this.head;
            while (node != null) {
                Node nodeToRemove = node;
                node = node.next;
                if (nodeToRemove.value == value) remove(nodeToRemove);
            }
        }

        // O(1) time | O(1) space
        public void remove(Node node) {
            if (node == head) head = this.head.next;
            if (node == tail) tail = this.tail.prev;
            if (node.prev != null) node.prev.next = node.next;
            if (node.next != null) node.next.prev = node.prev;
            node.prev = null;
            node.next = null;
        }

        // O(n) time | O(1) space
        public boolean containsNodeWithValue(int value) {
            Node node = this.head;
            while (node != null && node.value != value) node = node.next;
            return node != null;
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
