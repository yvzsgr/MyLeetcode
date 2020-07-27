package LinkedList;

public class LinkedListCycle {
    public boolean isLinkedListCycle(ListNode head) {
        if (head == null) return false;
        ListNode slowRunner = head;
        ListNode runner = head;
        while (runner.next != null && runner.next.next != null) {
            slowRunner = slowRunner.next;
            runner = runner.next.next;
            if (slowRunner == runner) return true;
        }
        return false;
    }
}