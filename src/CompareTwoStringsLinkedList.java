//Given two strings, represented as linked lists (every character is a node in a linked list).
// Write a function compare() that works similar to strcmp(), i.e.,
// it returns 0 if both strings are same, 1 if first linked list is lexicographically greater,
// and -1 if the second string is lexicographically greater.


public class CompareTwoStringsLinkedList {

    public int compare(Node node1, Node node2) {

        if (node1 == null && node2 == null) {
            return 1;
        }
        while (node1 != null && node2 != null && node1.data == node2.data) {
            node1 = node1.next;
            node2 = node2.next;
        }

        // if the list are different in size
        if (node1 != null && node2 != null) {
            return (node1.data > node2.data ? 1 : -1);
        }

        // if either of the list has reached end
        if (node1 != null && node2 == null) {
            return 1;
        }
        if (node1 == null && node2 != null) {
            return -1;
        }
        return 0;
    }

    static class Node {

        char data;
        Node next;

        // Constructor to create a new node
        Node(char d) {
            data = d;
            next = null;
        }
    }




}
