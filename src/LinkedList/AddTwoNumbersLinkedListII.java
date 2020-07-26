package LinkedList;//You are given two non-empty linked lists representing two non-negative integers.
// The most significant digit comes first and each of their nodes contain a single digit.
// Add the two numbers and return it as a linked list.


import java.util.Stack;

public class AddTwoNumbersLinkedListII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stackOne = new Stack<Integer>();
        Stack<Integer> stackTwo = new Stack<Integer>();

        while (l1 != null) {
            stackOne.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stackTwo.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        ListNode list = new ListNode(0);
        while (!stackOne.empty() || !stackTwo.empty()) {
            //add numbers
            if (!stackOne.empty()) sum += stackOne.pop();
            if (!stackTwo.empty()) sum += stackTwo.pop();
            //find digits
            list.val = sum % 10;
//            System.out.println(list.val);
            ListNode head = new ListNode(sum / 10);
//            System.out.println("head.val " + head.val);
            head.next = list; //adding list as second item
            list = head;
//            System.out.println("list val " + list.val);
            sum /= 10;
        }

        System.out.println(list.val);
        System.out.println(list.next.val);
        return list.val == 0 ? list.next : list;

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

}
