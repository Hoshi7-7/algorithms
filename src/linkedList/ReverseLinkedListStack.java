package linkedList;

import java.util.Stack;

public class ReverseLinkedListStack {
// Definition for singly-linked list.
public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
/*
    https://leetcode.com/problems/reverse-linked-list/description/
    Time complexity: O(n), where n is the number of nodes in the linked list.
    Space complexity: O(n), due to the stack used to store the values of the nodes.
    This solution uses a stack to reverse the linked list by pushing all node values onto the stack
    and then popping them back into the nodes in reverse order.

 */
    public ListNode reverseList(ListNode head) {
        int cont = 0;
        ListNode aux = head;
        ListNode tmp = head;
        Stack<Integer> values = new Stack<>();
        while(aux!=null){
            values.push(aux.val);
            aux = aux.next;
        }

        while(tmp!=null){
            tmp.val = values.pop();
            tmp=tmp.next;
        }

        return head;
    }
}
