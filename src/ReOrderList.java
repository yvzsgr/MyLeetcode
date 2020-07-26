public class ReOrderList {
    //It first come to my mind that reverse all and then merge but below solution
    //only reverse half and use less memory and it is also easy to track where to end loop

    public void reorderList(ListNode head) {
        if (head == null) return;
        ListNode head2 = Split(head);
        head2 = Reverse(head2);
        Merge(head, head2);
    }

    public ListNode Split(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;
        return head2;
    }

    public ListNode Reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode Merge(ListNode head1, ListNode head2)
    {
        ListNode curr1 = head1;
        ListNode curr2 = head2;

        while (curr1 != null && curr2 != null)
        {
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;

            curr1.next = curr2;
            curr2.next = next1;

            curr1 = next1;
            curr2 = next2;
        }

        return head1;
    }


}
