package LinkedList;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        if(head == null || head.next == null) return head;
        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
