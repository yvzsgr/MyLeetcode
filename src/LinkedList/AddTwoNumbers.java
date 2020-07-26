package LinkedList;//You are given two non-empty linked lists representing two non-negative integers.
//The digits are stored in reverse order and each of their nodes contain a single digit.
// Add the two numbers and return it as a linked list.

// 123 --> 1-->2-->3
// 348 --> 3-->4-->8
//result node --> first head

//edge case
// there might be carry at the end

//this is similar to 415 Add Strings

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) { //there might be carry at the end
            //adding is happening here
            int resVal = (l1 != null? l1.val : 0) + (l2 != null? l2.val : 0) + carry;
            //calculate result for that digit
            result.next = new ListNode(resVal % 10);
            //calculate carry
            carry = resVal / 10;
            //move to the next nodes
            l1 = (l1 == null ? l1 : l1.next);
            l2 = (l2 == null ? l2 : l2.next);
            //move to the next result node
            result = result.next;
        }
        return head.next;
    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }

    }
}
