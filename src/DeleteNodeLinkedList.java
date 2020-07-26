public class DeleteNodeLinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void deleteNode(Node node, Node n) {

        // When node to be deleted is head node
        if (node == n) {
            if (node.next == null) {
                System.out.println("There is only one node. The list can't be made empty ");
                return;
            }

            /* Copy the data of next node to head */
            node = node.next;

            // Remove the link of next node
            node.next = node.next.next;

            return;
        }

        // When not first node, follow the normal deletion process
        // find the previous node
        Node prev = node;
        while (prev.next != null && prev.next != n) {
            prev = prev.next;
        }

        // Check if node really exists in Linked List
        if (prev.next == null) {
            System.out.println("Given node is not present in Linked List");
            return;
        }

        // Remove node from Linked List
        prev.next = prev.next.next;

        return;
    }

}
