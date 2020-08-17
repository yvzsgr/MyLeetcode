package LinkedList;

public class RemoveDuplicatesFromLinkedListII {
    //iterative solution with two pointers
    // 1-->2-->2-->3-->4-->5
//curr             ^
//pre          ^

    public ListNode deleteDuplicates(ListNode head) {
    //use two pointers, slow - track the node before the dup nodes,
    // fast - to find the last node of dups.
    ListNode dummy = new ListNode(0), fast = head, slow = dummy;
    slow.next = fast;
    while(fast != null) {
        while (fast.next != null && fast.val == fast.next.val) {
            fast = fast.next;    //while loop to find the last node of the dups.
        }
        if (slow.next != fast) { //duplicates detected.
            slow.next = fast.next; //remove the dups.
            fast = slow.next;     //reposition the fast pointer.
        } else { //no dup, move down both pointer.
            slow = slow.next;
            fast = fast.next;
        }

    }
    return dummy.next;
        }
}

    //Another iteration solution
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head==null) return null;
//        ListNode FakeHead=new ListNode(0);
//        FakeHead.next=head;
//        ListNode pre=FakeHead;
//        ListNode cur=head;
//        while(cur!=null){
//            while(cur.next!=null&&cur.val==cur.next.val){
//                cur=cur.next;
//            }
//            if(pre.next==cur){
//                pre=pre.next;
//            }
//            else{
//                pre.next=cur.next;
//            }
//            cur=cur.next;
//        }
//        return FakeHead.next;
//    }

    //recursive solution
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null) return null;
//
//        if (head.next != null && head.val == head.next.val) {
//            while (head.next != null && head.val == head.next.val) {
//                head = head.next;
//            }
//            return deleteDuplicates(head.next);
//        } else {
//            head.next = deleteDuplicates(head.next);
//        }
//        return head;
//    }
